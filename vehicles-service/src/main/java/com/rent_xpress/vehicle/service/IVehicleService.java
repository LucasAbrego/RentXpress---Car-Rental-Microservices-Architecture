package com.rent_xpress.vehicle.service;

import com.rent_xpress.vehicle.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    Vehicle createVehicle(Vehicle vehicle);

    Vehicle getVehicleById(Long id);

    List<Vehicle> getAllVehicles();

    Vehicle updateVehicle(Long id, Vehicle vehicle);

    void deleteVehicle(Long id);
}
