package com.example.demo.car_rental_educative;

import lombok.Data;

import java.util.Date;

@Data
public class Vehicle {
    int vehicleNum;
    boolean isAvailable;
    String company;
    String model;
    Person person;
    Date reservationStartDate;
    Date reservationEndDate;
    int dailyPrice;
    int hourlyPrice;
    VehicleLog vehicleLog;

}
