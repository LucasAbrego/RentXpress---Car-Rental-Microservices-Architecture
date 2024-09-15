package com.rent_xpress.vehicle.service;

import com.rent_xpress.vehicle.model.Vehicle;
import com.rent_xpress.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService{
    @Autowired
    private VehicleRepository repoVehicle;
    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return repoVehicle.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return repoVehicle.findById(id).orElse(null);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return repoVehicle.findAll();
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        Vehicle dbVehicle = repoVehicle.findById(id).orElse(null);
        if(dbVehicle!=null){
            dbVehicle.setMake(vehicle.getMake());
            dbVehicle.setModel(vehicle.getModel());
            dbVehicle.setYear(vehicle.getYear());
            dbVehicle.setColor(vehicle.getColor());
            dbVehicle.setLicensePlate(vehicle.getLicensePlate());
            dbVehicle.setPricePerDay(vehicle.getPricePerDay());
            dbVehicle.setAvailability(vehicle.isAvailability());
            dbVehicle.setDescription(vehicle.getDescription());
            dbVehicle.setImageUrl(vehicle.getImageUrl());
            repoVehicle.save(dbVehicle);
        }
        return dbVehicle;
    }

    @Override
    public void deleteVehicle(Long id) {
        repoVehicle.deleteById(id);
    }
}
