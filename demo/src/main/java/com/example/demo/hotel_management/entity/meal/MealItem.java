package com.example.demo.hotel_management.entity.meal;

import com.example.demo.hotel_management.entity.menu.MenuItem;
import org.springframework.stereotype.Service;

@Service
public class MealItem {
    int mealIteamId;
    int quantity;
    MenuItem menuItem;

    public boolean updateQuantity(int qty){return true;}
}
