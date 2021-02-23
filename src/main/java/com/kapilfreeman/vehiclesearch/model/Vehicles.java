package com.kapilfreeman.vehiclesearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicles {

    @Id
    private int id;
    @ElementCollection
    private List<Vehicle> vehicle;



}
