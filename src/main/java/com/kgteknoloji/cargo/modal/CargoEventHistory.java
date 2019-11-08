package com.kgteknoloji.cargo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class CargoEventHistory {

    @Id
    private String id;

    private long orderId;

    private String cargoEventExplanation;

    public CargoEventHistory() {
    }

    public CargoEventHistory(long orderId, String cargoEventExplanation) {
        this.orderId = orderId;
        this.cargoEventExplanation = cargoEventExplanation;
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

    public String getCargoEventExplanation() {
        return cargoEventExplanation;
    }

    public void setCargoEventExplanation(String cargoEventExplanation) {
        this.cargoEventExplanation = cargoEventExplanation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoEventHistory that = (CargoEventHistory) o;
        return orderId == that.orderId &&
                Objects.equals(id, that.id) &&
                Objects.equals(cargoEventExplanation, that.cargoEventExplanation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, cargoEventExplanation);
    }

    @Override
    public String toString() {
        return "CargoOrderHistory{" +
                "id='" + id + '\'' +
                ", orderId=" + orderId +
                ", cargoEventExplanation='" + cargoEventExplanation + '\'' +
                '}';
    }
}
