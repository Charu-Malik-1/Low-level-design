package com.example.demo.hotel_management.entity.table;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Table {
    private int tableId;
    int tableLocation;
    private List<TableSeat> tableSeats;
    private boolean isAvailable;
    private int capacity;

    public Table(int tableId,int capacity){
        this.tableId=tableId;
        this.isAvailable=true;
        this.capacity=capacity;
    }

    public boolean addReservation() {
        return true;
    }

    public static List<Table> serach(int capacity, Date startTime) {
        return null;
    }

    public void freeTable() {
        isAvailable = true;
    }
}
