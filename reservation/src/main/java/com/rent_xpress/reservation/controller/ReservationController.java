package com.rent_xpress.reservation.controller;

import com.rent_xpress.reservation.dto.ReservationDTO;
import com.rent_xpress.reservation.dto.User;
import com.rent_xpress.reservation.dto.Vehicle;
import com.rent_xpress.reservation.model.Reservation;
import com.rent_xpress.reservation.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private IReservationService servReservation;

    @PostMapping("/create")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return servReservation.createReservation(reservation);
    }

    @GetMapping("/get/{id}")
    public ReservationDTO getReservationById(@PathVariable Long id) {
        return servReservation.getReservationById(id);
    }

    @GetMapping("/getAll")
    public List<Reservation> getAllReservations() {
        return servReservation.getAllReservations();
    }

    @PutMapping("/update/{id}")
    public Reservation updateReservation(@PathVariable Long id, @RequestBody Reservation reservation) {
        return servReservation.updateReservation(id, reservation);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteReservation(@PathVariable Long id) {
        servReservation.deleteReservation(id);
        return "Reservation deleted successfully.";
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable Long userId){
        return servReservation.getUserById(userId);
    }
    @GetMapping("/vehicle/{vehicleId}")
    public Vehicle getVehicleById(@PathVariable Long vehicleId){
        return servReservation.getVehicleById(vehicleId);
    }

    //PRUEBA LOAD BALANCER

    @Value("${server.port}")
    private int serverPort;
    @GetMapping("/lb")
    public String testLoadBalancer(){
        return "Reservation service port: " + serverPort;
    }
}
