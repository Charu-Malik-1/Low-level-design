package com.example.demo.hotel_management.entity.reservation;

import com.example.demo.hotel_management.entity.table.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//@AllArgsConstructor
@Data
//@Service
public class Reservation {
    private int reservationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int tableId;
    private static int reservationIdCount = 0;

    public Reservation(){
        reservationId=-1;
        startTime=null;
        endTime=null;
        tableId=-1;
    }

    public Reservation(int reservationId,LocalDateTime startTime,LocalDateTime endTime,int tableId){
        this.reservationId=reservationId;
        this.startTime=startTime;
        this.endTime=endTime;
        this.tableId=tableId;
    }

    public void reserveTable(int branchId, Date startDate, Date endDate) {
    }

    public Reservation makeReservation(Table table, LocalDateTime startTime, LocalDateTime endTime,int tableId) {
        // todo reserve table
        reservationIdCount++;
        Reservation reservation = new Reservation(reservationIdCount, startTime, endTime, tableId);
        System.out.println("Reservation successful");
        return reservation;
    }

    public boolean cancelReservation(int reservationId) {
        return true;
    }

}
