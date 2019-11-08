package com.kgteknoloji.cargo.repository;

import com.kgteknoloji.cargo.modal.CargoCompanyType;
import com.kgteknoloji.cargo.modal.Shipment;
import com.kgteknoloji.cargo.modal.ShipmentStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ShipmentRepository extends MongoRepository<Shipment, String> {

    Shipment findByOrderId(long orderId);

    List<Shipment> findByCargoCompanyTypeAndStatus(CargoCompanyType companyType, ShipmentStatus status);

}
