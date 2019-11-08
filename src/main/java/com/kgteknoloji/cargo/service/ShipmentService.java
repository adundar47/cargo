package com.kgteknoloji.cargo.service;

import com.kgteknoloji.cargo.config.UserInfoProperties;
import com.kgteknoloji.cargo.exception.AlreadyExistException;
import com.kgteknoloji.cargo.exception.BadRequestException;
import com.kgteknoloji.cargo.modal.Result;
import com.kgteknoloji.cargo.modal.Shipment;
import com.kgteknoloji.cargo.modal.ShipmentCreate;
import com.kgteknoloji.cargo.modal.ShipmentStatus;
import com.kgteknoloji.cargo.repository.ShipmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderDispatcherServices;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderResultVO;
import tr.com.yurticikargo.shippingorderdispatcherservices.YurticikargoWSException;

import static com.kgteknoloji.cargo.utils.Utils.getOrderIdAlreadyExistError;

@Service
public class ShipmentService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private ShipmentRepository shipmentRepository;

    private ShippingOrderDispatcherServices shippingOrderDispatcherServices;

    private UserInfoProperties userInfoProperties;

    public ShipmentService(ShipmentRepository shipmentRepository, ShippingOrderDispatcherServices shippingOrderDispatcherServices, UserInfoProperties userInfoProperties) {
        this.shipmentRepository = shipmentRepository;
        this.shippingOrderDispatcherServices = shippingOrderDispatcherServices;
        this.userInfoProperties = userInfoProperties;
    }

    public Result<?> createShipment(ShipmentCreate shipmentCreate) throws YurticikargoWSException, AlreadyExistException, BadRequestException {

        LOGGER.debug("[createShipment]: CreateShipment is : {}", shipmentCreate.toString());

        if (shipmentRepository.findByOrderId(shipmentCreate.getOrderId()) != null) {
            throw new AlreadyExistException(getOrderIdAlreadyExistError(shipmentCreate.getOrderId()));
        }

        ShippingOrderResultVO result = shippingOrderDispatcherServices.createShipment(userInfoProperties.getUsername(), userInfoProperties.getPassword(),
                userInfoProperties.getLanguage(), shipmentCreate.getShippingOrderVO());

        if (!result.getErrCode().isEmpty()) {
            throw new BadRequestException(result.getOutResult());
        }

//        shipmentRepository.save(new Shipment(shipmentCreate.getOrderId(), ShipmentStatus.DISTRIBUTION, shipmentCreate.getCargoCompanyType()));

        result.getShippingOrderDetailVO().forEach(s -> {
            shipmentRepository.save(new Shipment(shipmentCreate.getOrderId(), ShipmentStatus.DISTRIBUTION, shipmentCreate.getCargoCompanyType()));
        });

        return Result.success(HttpStatus.OK, result);
    }
}
