package com.kapilfreeman.vehiclesearch.service;

import com.kapilfreeman.vehiclesearch.model.Vehicles;
import com.kapilfreeman.vehiclesearch.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VehicleService {
    private VehicleRepository vehicleRepository;

    public Vehicles save(Vehicles vehicles){
        return vehicleRepository.save(vehicles);
    }
}
