package com.example.demo.hotel_management.entity.restaurant;

import com.example.demo.hotel_management.entity.menu.Menu;
import com.example.demo.hotel_management.entity.menu.MenuItem;
import com.example.demo.hotel_management.entity.menu.MenuSection;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Data
public class Restaurant {
    private int restId;
    private String restName;
    private Map<String, Branch> branchMap;

    public Restaurant() {
        branchMap = new HashMap<>();
    }

    public void addBranch(Branch branch) {
        branchMap.put(branch.getBranchName(), branch);
        System.out.println(branch.getBranchName() + " branch added successfully...");
    }

    public void deleteBranch(String name) {
        if (branchMap.containsKey(name)) {
            branchMap.remove(name);
            System.out.println(name + " branch removed successfully...");
        } else {
            System.out.println("Branch removed successfully...");
        }
    }

    public void makeReservation(String branhName, LocalDateTime startDateTime, LocalDateTime endDateTime, int peopleCount) {
        if (branchMap.containsKey(branhName)) {
            Branch branch = branchMap.get(branhName);
            branch.makeReservation(startDateTime, endDateTime, peopleCount);
        } else {
            System.out.println("No branch exist");
        }
    }

    public void cancelReservation(String branchName, int reservationId) {
        if (branchMap.containsKey(branchName)) {
            Branch branch = branchMap.get(branchName);
            branch.cancelReservation(reservationId);
        }
    }

    public void printAllBranches() {
        Iterator<Map.Entry<String, Branch>> iterator = branchMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Branch> branchEntry = iterator.next();
            Branch branch = branchEntry.getValue();
            System.out.println(branch.getBranchName() + " open:" + branch.isOpen());
        }
    }

    public void setMenu(String branchName, Menu menu) {
        if (branchMap.containsKey(branchName)) {
            Branch branch = branchMap.get(branchName);
            branch.setMenu(menu);
        }
    }

    public void addMenuSection(String branchName, MenuSection menuSection){
        if (branchMap.containsKey(branchName)) {
            Branch branch = branchMap.get(branchName);
            branch.setMenuSection(menuSection);
        }
    }

    public void addMenuItem(String branchName, String menuSectionName, MenuItem menuItem){
        if (branchMap.containsKey(branchName)) {
            Branch branch = branchMap.get(branchName);
            branch.addMenuItem(menuSectionName,menuItem);
        }
    }
}

