package com.example.demo.car_rental_lld;

import lombok.Data;

@Data
public class Vehicle {
    int vehicleId;
    String company;
    String model;
    int kilometersDriven;
    int dailyRentalCost;
    int hourlyRentalCost;
    VehicleType vehicleType;
    VehicleStatus vehicleStatus;
    boolean isAvailable;
}
