package com.kgteknoloji.cargo.service;

import com.kgteknoloji.cargo.config.UserInfoProperties;
import com.kgteknoloji.cargo.modal.CargoCompanyType;
import com.kgteknoloji.cargo.modal.CargoEventHistory;
import com.kgteknoloji.cargo.modal.Shipment;
import com.kgteknoloji.cargo.modal.ShipmentStatus;
import com.kgteknoloji.cargo.repository.CargoEventRepository;
import com.kgteknoloji.cargo.repository.ShipmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tr.com.yurticikargo.sswintegrationservices.CustParamsVO;
import tr.com.yurticikargo.sswintegrationservices.ShippingDataResponseVO;
import tr.com.yurticikargo.sswintegrationservices.WsReportWithReferenceServices;
import tr.com.yurticikargo.sswintegrationservices.YurticikargoWSException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.kgteknoloji.cargo.utils.Utils.*;

@Component
public class ScheduledTasks {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private WsReportWithReferenceServices sswIntegrationServices;

    private UserInfoProperties userInfoProperties;

    private ShipmentRepository shipmentRepository;

    private CargoEventRepository cargoEventRepository;

    public ScheduledTasks(WsReportWithReferenceServices sswIntegrationServices, UserInfoProperties userInfoProperties, ShipmentRepository shipmentRepository, CargoEventRepository cargoEventRepository) {
        this.sswIntegrationServices = sswIntegrationServices;
        this.userInfoProperties = userInfoProperties;
        this.shipmentRepository = shipmentRepository;
        this.cargoEventRepository = cargoEventRepository;
    }

    @Scheduled(fixedRateString = "${rate}", initialDelay = 5000)
    public void updateShipmentStatus() throws YurticikargoWSException {

        CustParamsVO custParamsVO = new CustParamsVO();
        custParamsVO.getInvCustIdArray().add(CUST_ID);

        List<Shipment> shipments = shipmentRepository.findByCargoCompanyTypeAndStatus(CargoCompanyType.YurticiKargo, ShipmentStatus.DISTRIBUTION);

        List<String> ids = new ArrayList<>();
        shipments.forEach(shipment -> {
            ids.add(getOrderKey(shipment.getOrderId()));
        });

        ShippingDataResponseVO response = sswIntegrationServices.listInvDocumentByGrpSpecialField(userInfoProperties.getUsername(), userInfoProperties.getPassword(),
                userInfoProperties.getLanguage(), custParamsVO, FIELD_NAME, ids, dateFormat.format(new Date()),
                dateFormat.format(new Date(new Date().getTime() + HOUR)), "0", "0");

        response.getShippingDataDetailVOArray().forEach(s -> {
            ShipmentStatus type = getType(s);
            if (ShipmentStatus.DISTRIBUTION.equals(type)) {
                cargoEventRepository.save(new CargoEventHistory(getOrderId(s.getFieldValue()), s.getCargoEventExplanation()));
            }
        });

    }
}
