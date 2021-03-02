package com.kapilfreeman.vehiclesearch.repository;

import com.kapilfreeman.vehiclesearch.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
   // List<Vehicle> findBymodel(String model);

    List<Vehicle> findByVehicleDetails_model(String model);

    List<Vehicle> findByVehicleDetails_vehiclePrice_finalPrice_Between(double from, double to);

    List<Vehicle> findByVehicleDetails_vehicleFeature_exterior_Containing(String exterior);

    List<Vehicle> findByVehicleDetails_vehicleFeature_interior_Containing(String interior);

//    List<Vehicle> findByVehicleDetails_vehicleFeature_Exterior_Contains(String exterior);
//
//    List<Vehicle> findByVehicleDetails_vehicleFeature_Interior_Contains(String interior);

//    List<Vehicle> findByVehicleDetails_VehicleFeature_Exterior_Containing(String exterior);
//
//    List<Vehicle> findByVehicleDetails_VehicleFeature_Interior_Containing(String interior);
////
//    List<Vehicle> findByVehicleDetails_vehicleFeature_exterior_Contains(String exterior);
//
//    List<Vehicle> findByVehicleDetails_vehicleFeature_interior_Contains(String interior);

//    List<Vehicle> findByVehicleDetails_vehicleFeature_exteriorFeatureString_Containing(String exterior);
//
//    List<Vehicle> findByVehicleDetails_vehicleFeature_interiorFeatureString_Containing(String interior);

//    List<Vehicle> findByVehicleDetails_vehicleFeature_exteriorlist_Containing(String exterior);
//
//    List<Vehicle> findByVehicleDetails_vehicleFeature_interiorlist_Containing(String interior);
//
//    // List<Vehicle> findByVehicleDetails_vehiclePrice_finalPrice(String price);
}
