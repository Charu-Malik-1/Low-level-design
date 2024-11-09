package com.example.demo.book_my_show;

import java.util.List;

import lombok.Data;

@Data
public class Cinema {
    int cinemaId;
    List<Hall> halls;
    City city;
}
