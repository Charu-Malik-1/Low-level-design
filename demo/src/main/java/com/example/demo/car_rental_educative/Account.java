package com.example.demo.car_rental_educative;

import lombok.Data;

@Data
public class Account {
    int id;
    String password;
    AccountStatus accountStatus;
}
