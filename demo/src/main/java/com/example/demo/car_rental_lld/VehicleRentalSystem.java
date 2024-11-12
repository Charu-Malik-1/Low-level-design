package com.example.demo.car_rental_lld;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;

    // CRUD on store and user
    public VehicleRentalSystem() {
        users = new ArrayList<>();
        stores = new ArrayList<>();
        initialise();
    }

    //start point
    public static void runner() {

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        // 1. user can search store based on location/city
        // get all stores in hyderabad
        Store store = vehicleRentalSystem.getStoreFromCity("hyderabad", "nanakramguda");

        //2. create reservation for car skoda kaushaq for the above store
        List<Vehicle> vehicleList=store.getVehicle(VehicleType.CAR);

        // 3. create reservation
        Reservation reservation=store.createReservation(vehicleList.get(0),vehicleRentalSystem.users.get(0));

        // generate bill
        Bill bill=new Bill(reservation);

        //make payment
        Payment payment=new Payment();
        payment.payBill(bill);

        // 6. trip complete, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservationId);
    }

    Store getStoreFromCity(String city, String area) {

        for (int i = 0; i < stores.size(); i++) {
            if (stores.get(i).getLocation().getCity().equals(city) && stores.get(i).getLocation().getAddress().equals(area)) {
                System.out.println("stores present in city=" + city + " area=" + area);
                System.out.println(stores.get(i).getStoreId());
                return stores.get(i);
            }
        }

        return null;
    }

    void initialise() {
        createStores();
        createUsers();
    }

    void createUsers() {
        User user1 = new User();
        user1.setUserName("charu");
        user1.setUserId(1);
        user1.setLicenceNo("1234ggy");
        users.add(user1);

        User user2 = new User();
        user2.setUserName("harsha");
        user2.setUserId(2);
        user2.setLicenceNo("1254ggy");
        users.add(user2);
    }

    Vehicle createVehicle(int vehicleId, String company, String model, int kilometersDriven, int dailyRentalCost, int hourlyRentalCost, VehicleType vehicleType, VehicleStatus vehicleStatus) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(vehicleId);
        vehicle.setCompany(company);
        vehicle.setModel(model);
        vehicle.setKilometersDriven(kilometersDriven);
        vehicle.setDailyRentalCost(dailyRentalCost);
        vehicle.setHourlyRentalCost(hourlyRentalCost);
        vehicle.setVehicleType(vehicleType);
        vehicle.setVehicleStatus(vehicleStatus);
        return vehicle;
    }

    void createStores() {
        Store store1 = new Store();
        store1.setStoreId(1);

        Location location1 = new Location();
        location1.setCity("Hyderabad");
        location1.setPinCode(500032);
        location1.setAddress("nanakramguda");
        store1.setLocation(location1);
        VehicleInventoryManagement vehicleInventoryManagement = store1.getVehicleInventoryManagement();
        vehicleInventoryManagement.addVehicle(
                createVehicle(1, "skoda", "kushaq", 1000, 1000, 200, VehicleType.CAR, VehicleStatus.ACTIVE));

        stores.add(store1);

        Store store2 = new Store();
        store1.setStoreId(2);

        Location location2 = new Location();
        location2.setCity("bangalore");
        location2.setPinCode(500032);
        location2.setAddress("hitechcity");
        store2.setLocation(location2);
        VehicleInventoryManagement vehicleInventoryManagement2 = store2.getVehicleInventoryManagement();
        vehicleInventoryManagement2.addVehicle(
                createVehicle(2, "skoda", "kushaq", 1000, 1000, 200, VehicleType.CAR, VehicleStatus.ACTIVE));

        stores.add(store2);

        Store store3 = new Store();
        store3.setStoreId(2);

        Location location3 = new Location();
        location3.setCity("hyderabad");
        location3.setPinCode(500032);
        location3.setAddress("hitechcity");
        store3.setLocation(location3);
        VehicleInventoryManagement vehicleInventoryManagement3 = store3.getVehicleInventoryManagement();
        vehicleInventoryManagement3.addVehicle(
                createVehicle(3, "skoda", "kushaq", 1000, 1000, 200, VehicleType.CAR, VehicleStatus.ACTIVE));

        stores.add(store3);

    }
}
