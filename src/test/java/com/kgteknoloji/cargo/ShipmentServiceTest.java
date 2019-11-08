package com.kgteknoloji.cargo;

import com.kgteknoloji.cargo.config.UserInfoProperties;
import com.kgteknoloji.cargo.exception.AlreadyExistException;
import com.kgteknoloji.cargo.exception.BadRequestException;
import com.kgteknoloji.cargo.modal.*;
import com.kgteknoloji.cargo.repository.ShipmentRepository;
import com.kgteknoloji.cargo.service.ShipmentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderDispatcherServices;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderResultVO;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderVO;
import tr.com.yurticikargo.shippingorderdispatcherservices.YurticikargoWSException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ShipmentServiceTest {

    @MockBean
    ShipmentRepository shipmentRepository;

    @MockBean
    UserInfoProperties userInfoProperties;

    @MockBean
    ShippingOrderDispatcherServices shippingOrderDispatcherServices;


    ShipmentService shipmentService;

    @Before
    public void init() {
        shipmentService = new ShipmentService(shipmentRepository, shippingOrderDispatcherServices, userInfoProperties);
    }

    @Test(expected = AlreadyExistException.class)
    public void shouldThrowAlreadyExistForCreateShipmentResponses() throws YurticikargoWSException, BadRequestException, AlreadyExistException {
        Mockito.when(shipmentRepository.findByOrderId(1)).thenReturn(new Shipment(1L, ShipmentStatus.DELIVERED, CargoCompanyType.YurticiKargo));
        shipmentService.createShipment(shipmentCreate());
    }

    @Test(expected = BadRequestException.class)
    public void shouldThrowBadRequestForUnknownUserErrorResponses() throws YurticikargoWSException, BadRequestException, AlreadyExistException {
        ShipmentCreate shipmentCreate = shipmentCreate();
        ShippingOrderResultVO shippingOrderResultVO = new ShippingOrderResultVO();
        shippingOrderResultVO.setErrCode("1625");
        shippingOrderResultVO.setOutResult("Yurtiçi Kargo sisteminde kayıtlı USER kullanıcı adlı bir kullanıcı yok!");
        Mockito.when(shippingOrderDispatcherServices.createShipment(userInfoProperties.getUsername(), userInfoProperties.getPassword(),
                userInfoProperties.getLanguage(), shipmentCreate.getShippingOrderVO())).thenReturn(shippingOrderResultVO);
        shipmentService.createShipment(shipmentCreate);
    }

    @Test
    public void shouldCreateShipmentSuccess() throws YurticikargoWSException, BadRequestException, AlreadyExistException {
        ShipmentCreate shipmentCreate = shipmentCreate();
        ShippingOrderResultVO shippingOrderResultVO = new ShippingOrderResultVO();
        shippingOrderResultVO.setErrCode("");
        shippingOrderResultVO.setOutFlag("1");
        shippingOrderResultVO.setCount(1);
        shippingOrderResultVO.setOutFlag("Başarılı");
        Mockito.when(shippingOrderDispatcherServices.createShipment(userInfoProperties.getUsername(), userInfoProperties.getPassword(),
                userInfoProperties.getLanguage(), shipmentCreate.getShippingOrderVO())).thenReturn(shippingOrderResultVO);

        Mockito.when(shipmentRepository.save(new Shipment(shipmentCreate.getOrderId(), ShipmentStatus.DISTRIBUTION, shipmentCreate.getCargoCompanyType()))).thenReturn(new Shipment("1", shipmentCreate.getOrderId(), ShipmentStatus.DISTRIBUTION, shipmentCreate.getCargoCompanyType()));

        Result<ShippingOrderResultVO> response = (Result<ShippingOrderResultVO>) shipmentService.createShipment(shipmentCreate);
        assertThat(response).isNotNull();
        assertThat(response.getStatusCode().value()).isEqualTo(200);
        assertThat(response.getPayload().getOutFlag()).isEqualTo("Başarılı");

    }


    private ShipmentCreate shipmentCreate() {
        ShipmentCreate shipmentCreate = new ShipmentCreate();
        shipmentCreate.setOrderId(1);
        shipmentCreate.setCargoCompanyType(CargoCompanyType.YurticiKargo);
        ShippingOrderVO shippingOrderVO = new ShippingOrderVO();
        shippingOrderVO.setCargoKey("TCELLREF00000401");
        shippingOrderVO.setInvoiceKey("TCELLREF00000401");
        shippingOrderVO.setReceiverCustName("TEST ALICI 41");
        shippingOrderVO.setReceiverAddress("BARBAROS MAHALLESİ, NIDAKULE ATAŞEHIR KUZEY İŞ MERKEZI, BEGONYA SK. NO:3/A, 34746 ATAŞEHİR İSTANBUL");
        shippingOrderVO.setCityName("İSTANBUL");
        shippingOrderVO.setTownName("ATAŞEHİR");
        shippingOrderVO.setReceiverPhone1("5308650044");
        shipmentCreate.getShippingOrderVO().add(shippingOrderVO);
        return shipmentCreate;
    }

}
