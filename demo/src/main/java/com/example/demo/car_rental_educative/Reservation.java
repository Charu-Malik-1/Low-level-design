package com.example.demo.car_rental_educative;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Reservation {
    int reservationId;
    Date reservationDate;
    Vehicle vehicle;
    Customer customer;
    ReservationStatus reservationStatus;
    List<Equipment> equipmentList;

    public Reservation(){

    }
}
