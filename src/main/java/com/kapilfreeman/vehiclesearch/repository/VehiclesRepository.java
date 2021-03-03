package com.kapilfreeman.vehiclesearch.repository;

import com.kapilfreeman.vehiclesearch.model.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<Vehicles,Long> {
}
