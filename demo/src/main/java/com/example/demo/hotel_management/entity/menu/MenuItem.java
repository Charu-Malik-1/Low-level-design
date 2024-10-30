package com.example.demo.hotel_management.entity.menu;

import lombok.Data;

@Data
public class MenuItem {
    private int id;
    private String name;
    private double price;

    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean updatePrice(double price) {
        this.price = price;
        return true;
    }
}
