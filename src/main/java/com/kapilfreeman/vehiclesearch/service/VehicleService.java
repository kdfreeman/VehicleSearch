package com.kapilfreeman.vehiclesearch.service;

import com.kapilfreeman.vehiclesearch.model.Vehicle;
import com.kapilfreeman.vehiclesearch.model.VehicleInformation;
import com.kapilfreeman.vehiclesearch.repository.VehicleInformationRepository;
import com.kapilfreeman.vehiclesearch.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class VehicleService {
    //@Autowired
    //rivate VehicleRepository vehicleRepository;

    //@Autowired
    private VehicleInformationRepository vehicleInformationRepository;

    private VehicleRepository vehicleRepository;


    public VehicleInformation saveVehicles(VehicleInformation vehicle){
        return vehicleInformationRepository.save(vehicle);
    }

    public List<VehicleInformation> showAllVehicle() {
        return  vehicleInformationRepository.findAll();
    }

//    public List<VehicleInformation> findVehicleByModel(String model) {
//        return  vehicleInformationRepository.findByVehicles_Vehicle_VehicleDetails_model(model);
//    }

    public List<Vehicle> findVehicleByModelName(String model) {
        return vehicleRepository.findByVehicleDetails_model(model);

    }

    public List<Vehicle> findVehicleByPriceRange(double from, double to) {
        return vehicleRepository.findByVehicleDetails_vehiclePrice_finalPrice_Between(from,to);
    }

//    public List<Vehicle> findVehicleByPrice(String from, String to) {
//
//    }
}

