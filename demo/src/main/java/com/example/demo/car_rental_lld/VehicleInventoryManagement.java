package com.example.demo.car_rental_lld;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

    // CRUD
    List<Vehicle> getVehicles(){
        return vehicles;
    }
    void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAllCarVehicle(VehicleType vehicleType){
       List<Vehicle> vehicleList=new ArrayList<>();

        for(int i=0;i<vehicles.size();i++){
            if(vehicles.get(i).getVehicleType().equals(vehicleType)){
                vehicleList.add(vehicles.get(i));
            }
        }
        return vehicleList;
    }

    void deleteVehicle(){}
}
