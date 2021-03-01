package com.kapilfreeman.vehiclesearch.repository;

import com.kapilfreeman.vehiclesearch.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
   // List<Vehicle> findBymodel(String model);

    List<Vehicle> findByVehicleDetails_model(String model);

    List<Vehicle> findByVehicleDetails_vehiclePrice_finalPrice_Between(double from, double to);

    // List<Vehicle> findByVehicleDetails_vehiclePrice_finalPrice(String price);
}
