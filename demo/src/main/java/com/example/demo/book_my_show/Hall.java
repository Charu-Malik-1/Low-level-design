package com.example.demo.book_my_show;

import lombok.Data;

import java.util.List;

@Data
public class Hall {
    int hallId;
    List<Show> shows;
}
