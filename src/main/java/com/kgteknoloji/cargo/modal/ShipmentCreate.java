package com.kgteknoloji.cargo.modal;

import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShipmentCreate {

    private long orderId;

    private CargoCompanyType cargoCompanyType;

    private List<ShippingOrderVO> shippingOrderVO = new ArrayList<>();

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public CargoCompanyType getCargoCompanyType() {
        return cargoCompanyType;
    }

    public void setCargoCompanyType(CargoCompanyType cargoCompanyType) {
        this.cargoCompanyType = cargoCompanyType;
    }

    public List<ShippingOrderVO> getShippingOrderVO() {
        return shippingOrderVO;
    }

    public void setShippingOrderVO(List<ShippingOrderVO> shippingOrderVO) {
        this.shippingOrderVO = shippingOrderVO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentCreate that = (ShipmentCreate) o;
        return orderId == that.orderId &&
                cargoCompanyType == that.cargoCompanyType &&
                Objects.equals(shippingOrderVO, that.shippingOrderVO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, cargoCompanyType, shippingOrderVO);
    }

    @Override
    public String toString() {
        return "ShipmentCreate{" +
                "orderId=" + orderId +
                ", cargoCompanyType=" + cargoCompanyType +
                ", shippingOrderVO=" + shippingOrderVO +
                '}';
    }
}
