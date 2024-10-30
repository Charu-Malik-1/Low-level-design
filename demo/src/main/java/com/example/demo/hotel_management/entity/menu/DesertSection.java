package com.example.demo.hotel_management.entity.menu;

import java.util.HashMap;
import java.util.Map;

public class DesertSection extends MenuSection{
    private Map<String,MenuItem> desertSection;
    public DesertSection(){
        desertSection=new HashMap<>();
    }
    public void  addItemInSection(MenuItem menuItem,String name){}
    public void deleteItemFromSection(String name){}
}