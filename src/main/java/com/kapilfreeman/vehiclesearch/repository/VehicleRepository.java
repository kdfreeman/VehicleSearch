package com.kapilfreeman.vehiclesearch.repository;

import com.kapilfreeman.vehiclesearch.model.Vehicle;
import com.kapilfreeman.vehiclesearch.model.VehicleInformation;
import com.kapilfreeman.vehiclesearch.model.Vehicles;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface VehicleRepository extends JpaRepository<VehicleInformation, Integer> {

}
