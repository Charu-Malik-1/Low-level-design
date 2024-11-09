package com.example.demo.book_my_show;

import java.util.Date;
import java.util.List;

public class Booking {
    int bookingId;
    List<Ticket> tickets;
    List<Seat> seats;
    Date createdOn;
    int totalSeats;
    int amount;
    BookingStatus bookingStatus;

}
