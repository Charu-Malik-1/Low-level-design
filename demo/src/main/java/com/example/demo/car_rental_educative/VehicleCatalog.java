package com.example.demo.car_rental_educative;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCatalog {

    Map<String, List<Vehicle>> vehicleByModel;
    Map<String, List<Vehicle>> vehicleByCompany;
    VehicleInventoryManagement vehicleInventoryManagement;

    public VehicleCatalog(VehicleInventoryManagement vehicleInventoryManagement) {
        this.vehicleInventoryManagement = vehicleInventoryManagement;
        initailiseCatalog();
    }

    void initailiseCatalog() {
        List<Vehicle> vehicleList = vehicleInventoryManagement.getVehicles();
        vehicleByModel = new HashMap<>();
        vehicleByCompany = new HashMap<>();

        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle v = vehicleList.get(i);
            String model = v.getModel();

            if (vehicleByModel.containsKey(model)) {
                List<Vehicle> modelsVehicleList = vehicleByModel.get(model);
                modelsVehicleList.add(v);
                vehicleByModel.put(model, modelsVehicleList);
            } else {
                List<Vehicle> modelsVehicleList = new ArrayList<>();
                modelsVehicleList.add(v);
                vehicleByModel.put(model, modelsVehicleList);
            }

            String company = v.getCompany();

            if (vehicleByCompany.containsKey(company)) {
                List<Vehicle> companyList = vehicleByCompany.get(company);
                companyList.add(v);
                vehicleByCompany.put(company, companyList);
            } else {
                List<Vehicle> companyList = new ArrayList<>();
                companyList.add(v);
                vehicleByCompany.put(company, companyList);
            }
        }
    }

    public List<Vehicle> searchByModel(String model) {
        if (vehicleByModel.containsKey(model))
            return vehicleByModel.get(model);
        return null;
    }
}
