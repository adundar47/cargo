package com.kgteknoloji.cargo;

import com.kgteknoloji.cargo.modal.Result;
import com.kgteknoloji.cargo.repository.ShipmentRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import tr.com.yurticikargo.shippingorderdispatcherservices.CreateShipment;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderResultVO;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderVO;

import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ShipmentControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    ShipmentRepository shipmentRepository;


    @Test
    public void shouldReturnShipmentPostSuccess() throws URISyntaxException {
        CreateShipment shipment = createShipment();
//        ParameterizedTypeReference asd = new ParameterizedTypeReference<ResponseEntity<Result<ShippingOrderResultVO>>>() {
//        };

//        ResponseEntity<Result<ShippingOrderResultVO>> response = testRestTemplate.postForEntity("/api/v1/shipment", shipment, Result.class);

//        ResponseEntity<Result<ShippingOrderResultVO>> response = testRestTemplate.exchange(
//                b,
//                HttpMethod.POST,
//                shipment,
//                new ParameterizedTypeReference<Result<ShippingOrderResultVO>>() {});

//        assertThat(response.getStatusCodeValue()).isEqualTo(200);
//        assertThat(response.getBody().getPayload()).isGreaterThan(1);
    }

    private CreateShipment createShipment() {
        CreateShipment createShipment = new CreateShipment();
        ShippingOrderVO shippingOrderVO = new ShippingOrderVO();
        shippingOrderVO.setCargoKey("TCELLREF00000401");
        shippingOrderVO.setInvoiceKey("TCELLREF00000401");
        shippingOrderVO.setReceiverCustName("TEST ALICI 41");
        shippingOrderVO.setReceiverAddress("BARBAROS MAHALLESİ, NIDAKULE ATAŞEHIR KUZEY İŞ MERKEZI, BEGONYA SK. NO:3/A, 34746 ATAŞEHİR İSTANBUL");
        shippingOrderVO.setCityName("İSTANBUL");
        shippingOrderVO.setTownName("ATAŞEHİR");
        shippingOrderVO.setReceiverPhone1("5308650044");
        createShipment.getShippingOrderVO().add(shippingOrderVO);
        return createShipment;
    }

    @After
    public void after() {
        shipmentRepository.deleteAll();
    }
}
