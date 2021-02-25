package com.kapilfreeman.vehiclesearch.service;

import com.kapilfreeman.vehiclesearch.model.VehicleInformation;
import com.kapilfreeman.vehiclesearch.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleInformation saveVehicles(VehicleInformation vehicle){
        return vehicleRepository.save(vehicle);
    }

    public List<VehicleInformation> showAllVehicle() {
        return  vehicleRepository.findAll();
    }
}

