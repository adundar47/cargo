package com.kgteknoloji.cargo.controller;

import com.kgteknoloji.cargo.exception.AlreadyExistException;
import com.kgteknoloji.cargo.exception.BadRequestException;
import com.kgteknoloji.cargo.modal.ShipmentCreate;
import com.kgteknoloji.cargo.service.ShipmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.yurticikargo.shippingorderdispatcherservices.YurticikargoWSException;

@RestController
@RequestMapping("/api/v1")
public class ShipmentController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    private ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping("/shipment")
    public ResponseEntity<?> createShipment(@RequestBody ShipmentCreate createShipment) throws YurticikargoWSException, AlreadyExistException, BadRequestException {
        LOG.debug("[createMessage]: Create Shipment request is received. Shipment: {}", createShipment);
        return ResponseEntity.ok(shipmentService.createShipment(createShipment));
    }
}
