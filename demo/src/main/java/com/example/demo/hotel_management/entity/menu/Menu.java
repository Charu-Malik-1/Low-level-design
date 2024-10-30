package com.example.demo.hotel_management.entity.menu;

import lombok.Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Data
public class Menu {
    private int menuId;
    private String menuDescription;
    private Map<String, MenuSection> menuSectionsMap;

    public Menu(int id, String desc) {
        menuId = id;
        menuDescription = desc;
        menuSectionsMap = new HashMap<>();
    }

    public Menu() {
        menuId = -1;
        menuDescription = "";
        menuSectionsMap = new HashMap<>();
    }

    public void addMenuSection(MenuSection menuSection) {
        menuSectionsMap.put(menuSection.getName(), menuSection);
    }

    public MenuSection getMenuSectionByName(String name) {
        if (menuSectionsMap.containsKey(name)) {
            return menuSectionsMap.get(name);
        }
        return null;
    }

    public void updateMenuSection(MenuSection menuSection, String name) {

    }

    public void printMenu() {
        Iterator<Map.Entry<String, MenuSection>> iterator = menuSectionsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, MenuSection> menuSectionEntry = iterator.next();
            menuSectionEntry.getKey();
            menuSectionEntry.getValue();
        }
    }

    public void addMenuItem(String menuSection, MenuItem menuItem){
        if(menuSectionsMap.containsKey(menuSection)){
            MenuSection menuSection1= menuSectionsMap.get(menuSection);
            menuSection1.addMenuItem(menuItem);

        }

    }

}
