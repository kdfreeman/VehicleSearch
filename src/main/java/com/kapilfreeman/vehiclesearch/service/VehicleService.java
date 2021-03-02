package com.kapilfreeman.vehiclesearch.service;

import com.kapilfreeman.vehiclesearch.model.Vehicle;
import com.kapilfreeman.vehiclesearch.model.VehicleInformation;
import com.kapilfreeman.vehiclesearch.repository.VehicleInformationRepository;
import com.kapilfreeman.vehiclesearch.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public List<Vehicle> findVehicleByFeatures(String exterior, String interior) {
        List<Vehicle> Exterior=vehicleRepository.findByVehicleDetails_vehicleFeature_exterior_Containing(exterior);
        List<Vehicle> Interior=vehicleRepository.findByVehicleDetails_vehicleFeature_interior_Containing(interior);
        //Code to return union of Exterior and Interior
        Set<Vehicle> set = new HashSet<Vehicle>();

        set.addAll(Exterior);
        set.addAll(Interior);

        return new ArrayList<Vehicle>(set);
        //return Exterior;



    }


}

