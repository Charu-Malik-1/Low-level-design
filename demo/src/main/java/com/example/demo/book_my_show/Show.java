package com.example.demo.book_my_show;

import lombok.Data;

import java.util.List;

@Data
public class Show {
    int showId;
    List<Seat> seats;

}
