package com.kapilfreeman.vehiclesearch.repository;

import com.kapilfreeman.vehiclesearch.model.Vehicle;
import com.kapilfreeman.vehiclesearch.model.Vehicles;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service

public interface VehicleRepository extends CrudRepository<Vehicles, Vehicle> {

}
