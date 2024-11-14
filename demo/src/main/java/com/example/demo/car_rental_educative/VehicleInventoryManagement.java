package com.example.demo.car_rental_educative;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

    public VehicleInventoryManagement() {
        vehicles = new ArrayList<>();
    }


    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }
    // add vehicle
    //remove vehicle

}
