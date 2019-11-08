package com.kgteknoloji.cargo.repository;

import com.kgteknoloji.cargo.modal.CargoEventHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CargoEventRepository extends MongoRepository<CargoEventHistory, String> {


}
