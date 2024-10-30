package com.example.demo.hotel_management.entity;

import com.example.demo.hotel_management.entity.menu.Menu;
import com.example.demo.hotel_management.entity.menu.MenuItem;
import com.example.demo.hotel_management.entity.menu.MenuSection;
import com.example.demo.hotel_management.entity.restaurant.Branch;
import com.example.demo.hotel_management.entity.restaurant.Restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class RestaurantSystem {

    public static void fun() {
        Map<String, Restaurant> restaurantMap = new HashMap<>();

        Restaurant haldiRam = new Restaurant();
        restaurantMap.put("haldiram", haldiRam);
        Branch delhi = new Branch(1, "delhi");
        Branch noida = new Branch(2, "noida");
        haldiRam.addBranch(delhi);
        haldiRam.addBranch(noida);


        Restaurant pindBaluchi = new Restaurant();
        restaurantMap.put("pindbaluchi", pindBaluchi);
        Branch gachibowli = new Branch(1, "gachibowli");
        Branch nanakramguda = new Branch(2, "nanakramguda");
        pindBaluchi.addBranch(gachibowli);
        pindBaluchi.addBranch(nanakramguda);


        haldiRam.printAllBranches();
        pindBaluchi.printAllBranches();

        /** make reservation for haldiram- noida branch
         for 5 people
         on 2-oct
         for time 8:00 AM to 10:00 AM
         */
        int year = 2024;
        int month = 10;
        int dayOfMonth = 2;
        int hour1 = 8;
        int min1 = 0;
        int hour2 = 10;
        int min2 = 0;
        haldiRam.makeReservation("noida", getDateTime(year, month, dayOfMonth, hour1, min1), getDateTime(year, month, dayOfMonth, hour2, min2), 5);
        haldiRam.makeReservation("noida", getDateTime(year, month, dayOfMonth, hour1, min1), getDateTime(year, month, dayOfMonth, hour2, min2), 5);
        haldiRam.makeReservation("delhi", getDateTime(year, month, dayOfMonth, hour1, min1), getDateTime(year, month, dayOfMonth, hour2, min2), 5);

        /**
         * Setting menu
         * */

        haldiRam.setMenu("noida",new Menu(1,"Menu"));
        haldiRam.addMenuSection("noida",new MenuSection(1,"soup","DeliciousSoup"));
        haldiRam.addMenuItem("noida","soup",new MenuItem(1,"tomato soup",100));
        haldiRam.addMenuItem("noida","soup",new MenuItem(2,"mix soup",100));

    }


    //give order

    //make payment


    static LocalDateTime getDateTime(int year, int month, int dayOfMonth, int hour, int min) {
        // Create a LocalDate for October 2, 2024
        LocalDate date = LocalDate.of(year, month, dayOfMonth);

        // Create two LocalTime objects for the start and end times
        LocalTime startTime = LocalTime.of(hour, min);  // 8:00 AM
        LocalTime endTime = LocalTime.of(10, 0);   // 10:00 AM

        // Combine date and time into LocalDateTime
        LocalDateTime time = LocalDateTime.of(date, startTime);
        return time;
    }
}
