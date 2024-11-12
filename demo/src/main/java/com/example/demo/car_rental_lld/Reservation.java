package com.example.demo.car_rental_lld;

import lombok.Data;

import java.util.Date;
@Data
public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    long fromTimeStamp;
    long toTimeStamp;
    ReservationStatus reservationStatus;
    ReservationType reservationType;

    public int createReserve(User user,Vehicle vehicle){
        reservationId=1234;
        this.user=user;
        this.vehicle=vehicle;
        reservationType=ReservationType.DAILY;
        reservationStatus=ReservationStatus.SCHEDULED;
        return reservationId;
    }

    // Modify reservation functions

}
