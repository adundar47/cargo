package com.kgteknoloji.cargo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Shipment {

    @Id
    private String id;

    private long orderId;

    private ShipmentStatus status;

    private CargoCompanyType cargoCompanyType;

    public Shipment() {
    }

    public Shipment(long orderId, ShipmentStatus status, CargoCompanyType cargoCompanyType) {
        this.orderId = orderId;
        this.status = status;
        this.cargoCompanyType = cargoCompanyType;
    }

    public Shipment(String id, long orderId, ShipmentStatus status, CargoCompanyType cargoCompanyType) {
        this.id = id;
        this.orderId = orderId;
        this.status = status;
        this.cargoCompanyType = cargoCompanyType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }

    public CargoCompanyType getCargoCompanyType() {
        return cargoCompanyType;
    }

    public void setCargoCompanyType(CargoCompanyType cargoCompanyType) {
        this.cargoCompanyType = cargoCompanyType;
    }
}
