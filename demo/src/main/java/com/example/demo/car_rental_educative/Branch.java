package com.example.demo.car_rental_educative;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Branch {
    int branchId;
    // address
    VehicleInventoryManagement vehicleInventoryManagement;
    VehicleStall vehicleStall;
    VehicleCatalog vehicleCatalog;
    List<Reservation> reservations;

    public Branch() {
        vehicleInventoryManagement = new VehicleInventoryManagement();
        vehicleStall = new VehicleStall();
        reservations = new ArrayList<>();
    }

    public void initialiseCatalog() {
        vehicleCatalog = new VehicleCatalog(vehicleInventoryManagement);
    }
}
