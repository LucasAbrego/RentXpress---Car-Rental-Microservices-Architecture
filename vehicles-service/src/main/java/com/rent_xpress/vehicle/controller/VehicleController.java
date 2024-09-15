package com.rent_xpress.vehicle.controller;


import com.rent_xpress.vehicle.model.Vehicle;
import com.rent_xpress.vehicle.service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private IVehicleService servVehicle;

    @PostMapping("/create")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return servVehicle.createVehicle(vehicle);
    }

    @GetMapping("/get/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return servVehicle.getVehicleById(id);
    }

    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicles() {
        return servVehicle.getAllVehicles();
    }

    @PutMapping("/update/{id}")
    public Vehicle updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        return servVehicle.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable Long id) {
        servVehicle.deleteVehicle(id);
        return "Vehicle deleted successfully.";
    }


    //PRUEBA LOAD BALANCER

    @Value("${server.port}")
    private int serverPort;
    @GetMapping("/lb")
    public String testLoadBalancer(){
        return "Vehicles service port: " + serverPort;
    }
}