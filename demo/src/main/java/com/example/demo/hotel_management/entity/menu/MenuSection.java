package com.example.demo.hotel_management.entity.menu;

import lombok.Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Data
public class MenuSection {
    private int menuSectionId;
    private String name;
    private String description;
    Map<String, MenuItem> menuItemMap;

    public MenuSection(int id, String name, String description) {
        menuSectionId = id;
        this.name = name;
        this.description = description;
        menuItemMap = new HashMap<>();
    }

    public void addItemInSection(MenuItem menuItem, String name) {
        menuItemMap.put(name, menuItem);
    }

    public void deleteItemFromSection(String name) {
        if (menuItemMap.containsKey(name))
            menuItemMap.remove(name);
    }

    public void printAllMenuItems() {
        Iterator<Map.Entry<String, MenuItem>> itemIterator = menuItemMap.entrySet().iterator();
        while (itemIterator.hasNext()) {
            Map.Entry<String, MenuItem> entry = itemIterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public void addMenuItem(MenuItem menuItem){
        menuItemMap.put(menuItem.getName(),menuItem);
    }
}
