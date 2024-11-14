package com.example.demo.car_rental_educative;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Customer extends Account{
    String licenceNum;

    // make reservation
    Map<Date, List<Vehicle>> history;
}
