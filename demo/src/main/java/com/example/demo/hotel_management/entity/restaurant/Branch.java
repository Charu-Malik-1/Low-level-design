package com.example.demo.hotel_management.entity.restaurant;

import com.example.demo.hotel_management.entity.menu.Menu;
import com.example.demo.hotel_management.entity.menu.MenuItem;
import com.example.demo.hotel_management.entity.menu.MenuSection;
import com.example.demo.hotel_management.entity.reservation.Reservation;
import com.example.demo.hotel_management.entity.table.Table;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.*;

@Data
public class Branch {
    private int branchId;
    private String branchName;
    private boolean isOpen;
    private Menu menu;
    private Map<Integer, Table> tableMap;
    private Map<Integer, Reservation> reservationMap;
    private Reservation tableReservation;

    public Branch(int branchId, String branchName) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.isOpen = true;
        this.menu = new Menu();
        this.reservationMap = new HashMap<>();
        tableMap = new HashMap<>();
        tableMap.put(1, new Table(1, 6));
        tableMap.put(2, new Table(2, 2));
        tableMap.put(3, new Table(3, 4));
        tableMap.put(4, new Table(4, 6));
        tableMap.put(5, new Table(5, 8));
        reservationMap = new HashMap<>();
        tableReservation = new Reservation();
    }

    public void addTable() {
    }

    public void deleteTable() {
    }

    public Table getAvailableTable(int peopleCount) {
        Iterator<Map.Entry<Integer, Table>> iterator = tableMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Table> entry = iterator.next();
            Table t = entry.getValue();
            if (t.isAvailable() && t.getCapacity() >= peopleCount)
                return t;
        }
        return null;
    }

    public Map<Integer, Reservation> getAllReservation() {
        return reservationMap;
    }

    public Reservation makeReservation(LocalDateTime startTime, LocalDateTime endTime, int peopleCount) {
        Table table = getAvailableTable(peopleCount);
        Reservation reservation = tableReservation.makeReservation(table, startTime, endTime, table.getTableId());
        //update table
        table.setAvailable(false);
        tableMap.put(table.getTableId(), table);
        //update reservation
        reservationMap.put(reservation.getReservationId(), reservation);
        return reservation;
    }


    void cancelReservation(int reservationId) {
        if (reservationMap.containsKey(reservationId)) {
            Reservation reservation = reservationMap.get(reservationId);
            int tableId = reservation.getTableId();
            reservation = null;
            reservationMap.remove(reservationId);

            // update table status
            Table table = tableMap.get(tableId);
            table.setAvailable(true);
            tableMap.put(tableId, table);
            System.out.println("Reservation cancelled successfully");
        } else {
            System.out.println("Invalid reservation Id");
        }
    }

    public void setMenu(Menu menu){
        this.menu=menu;
    }

    public void setMenuSection(MenuSection menuSection){
        menu.addMenuSection(menuSection);
    }

    public void addMenuItem(String menuSection, MenuItem menuItem){
        menu.addMenuItem(menuSection,menuItem);
    }

}
