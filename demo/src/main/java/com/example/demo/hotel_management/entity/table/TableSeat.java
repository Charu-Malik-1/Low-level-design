package com.example.demo.hotel_management.entity.table;

import com.example.demo.hotel_management.entity.util.SeatType;
import lombok.Data;

@Data
public class TableSeat {
    private int seatId;
    SeatType seatType;

}
