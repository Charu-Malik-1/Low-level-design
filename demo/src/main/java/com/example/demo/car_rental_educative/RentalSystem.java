package com.example.demo.car_rental_educative;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class RentalSystem {
    List<Branch> branches;
    List<Customer> customers;

    public RentalSystem() {
        branches = new ArrayList<>();
        customers = new ArrayList<>();
        initialise();
    }

    public void initialise() {
        initialiseBranches();
        initialiseCustomer();
    }

    public static void runner() {
        RentalSystem rentalSystem = new RentalSystem();

        Branch branch = rentalSystem.getBranches().get(0);
        //search vehicle by model
        List<Vehicle> vehicleList = branch.getVehicleCatalog().searchByModel("seltos");

        System.out.println("vehicle list=" + vehicleList);
        
        //reserve vehicle
        Reservation reservation=new Reservation();
        reservation.setReservationId(1);



    }

    void initialiseCustomer() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setPassword("acb");
        customer.setAccountStatus(AccountStatus.ACTIVE);
        customers.add(customer);

        customer = new Customer();
        customer.setId(2);
        customer.setPassword("acb1");
        customer.setAccountStatus(AccountStatus.ACTIVE);
        customers.add(customer);
    }

    Vehicle createVehicle(int vehicleNum, boolean isAvailable, String company, String model, int dailyPrice, int hourlyPrice) {
        Vehicle v = new Vehicle();
        v.setVehicleNum(vehicleNum);
        v.setAvailable(isAvailable);
        v.setCompany(company);
        v.setModel(model);
        v.setDailyPrice(dailyPrice);
        v.setHourlyPrice(hourlyPrice);
        return v;
    }

    void initialiseBranches() {
        Branch branch1 = new Branch();
        branch1.setBranchId(1);
        Vehicle v = createVehicle(1, true, "skoda", "salavia", 1000, 500);
        Vehicle v1 = createVehicle(2, true, "skoda", "kushaq", 5000, 1000);
        Vehicle v2 = createVehicle(3, true, "kia", "seltos", 1000, 500);
        Vehicle v3 = createVehicle(1, true, "skoda", "kushaq", 5000, 1000);
        List<Vehicle> vehicleList = branch1.getVehicleInventoryManagement().getVehicles();
        vehicleList.add(v);
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);
        branch1.getVehicleInventoryManagement().setVehicles(vehicleList);
        branch1.initialiseCatalog();
        branches.add(branch1);

        Branch branch2 = new Branch();
        branch2.setBranchId(2);
        Vehicle v21 = createVehicle(1, true, "kia", "seltos", 1000, 500);
        Vehicle v22 = createVehicle(2, true, "kia", "sonet", 5000, 1000);
        Vehicle v23 = createVehicle(3, true, "kia", "seltos", 1000, 500);
        Vehicle v24 = createVehicle(1, true, "kia", "sonet", 5000, 1000);
        List<Vehicle> vehicleList2 = branch2.getVehicleInventoryManagement().getVehicles();
        vehicleList2.add(v21);
        vehicleList2.add(v22);
        vehicleList2.add(v23);
        vehicleList2.add(v24);
        branch2.getVehicleInventoryManagement().setVehicles(vehicleList2);
        branch2.initialiseCatalog();
        branches.add(branch2);
    }


}
