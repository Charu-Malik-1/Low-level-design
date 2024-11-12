package com.example.demo.car_rental_lld;

import lombok.Data;

@Data
public class Bill {
    Reservation reservation;
    boolean isPaid;
    double amount;

    public Bill(Reservation reservation){
        this.reservation=reservation;
        amount=computeAmount();
        isPaid=false;
    }

    public double computeAmount(){
        return 100.0;
    }
}
