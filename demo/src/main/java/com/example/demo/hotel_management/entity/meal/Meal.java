package com.example.demo.hotel_management.entity.meal;

import com.example.demo.hotel_management.entity.menu.MenuItem;
import com.example.demo.hotel_management.entity.table.TableSeat;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Meal {
    int mealId;
    TableSeat tableSeat;
    List<MealItem> mealtemList;

    void addMealItem(MealItem mealItem){}

}
