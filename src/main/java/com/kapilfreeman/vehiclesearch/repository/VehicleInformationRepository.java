package com.kapilfreeman.vehiclesearch.repository;

import com.kapilfreeman.vehiclesearch.model.VehicleInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VehicleInformationRepository extends JpaRepository <VehicleInformation,Long> {
    //List<VehicleInformation> findByModelIgnoreCase(String model);

    //List<VehicleInformation> findByVehiclesVehicleDetailsModel(String model);

    //List<VehicleInformation> findByVehicles_VehicleDetails_model(String model);

    List<VehicleInformation> findByVehicles_Vehicle_VehicleDetails_model(String model);
}
