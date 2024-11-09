package com.example.demo.book_my_show;

import java.util.Date;

public abstract class Payment {
    double amount;
    PaymentStatus paymentStatus;
    Date timing;
    public abstract  boolean makePayment();
}
