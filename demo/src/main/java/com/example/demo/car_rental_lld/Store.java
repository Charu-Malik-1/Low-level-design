package com.example.demo.car_rental_lld;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Store {
    int storeId;
    Location location;
    VehicleInventoryManagement vehicleInventoryManagement;
    List<Reservation> reservations;

    public Store(){
        vehicleInventoryManagement=new VehicleInventoryManagement();
        reservations=new ArrayList<>();
    }

    List<Vehicle> getAllVehicles(){
        return vehicleInventoryManagement.getVehicles();
    }

    public List<Vehicle> getVehicle(VehicleType vehicleType){
       return vehicleInventoryManagement.getAllCarVehicle(vehicleType);

    }
    public Reservation createReservation(Vehicle vehicle,User user){
        Reservation reservation=new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);

        // update status of vehicle to booked
        vehicle.setIsAvailable(false);

        // update status of user
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        // take out the reservation from list and call complete reservation method
        return true;
    }
}
