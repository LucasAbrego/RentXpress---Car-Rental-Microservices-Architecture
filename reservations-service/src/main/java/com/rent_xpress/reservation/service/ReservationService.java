package com.rent_xpress.reservation.service;

import com.rent_xpress.reservation.dto.ReservationDTO;
import com.rent_xpress.reservation.dto.User;
import com.rent_xpress.reservation.dto.Vehicle;
import com.rent_xpress.reservation.model.Reservation;
import com.rent_xpress.reservation.repository.ReservationRepository;
import com.rent_xpress.reservation.repository.UserServiceClient;
import com.rent_xpress.reservation.repository.VehicleServiceClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {
    @Autowired
    private ReservationRepository repoReservation;

    @Autowired
    private UserServiceClient userServiceClient;

    @Autowired
    private VehicleServiceClient vehicleServiceClient;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return repoReservation.save(reservation);
    }

    @Override
    public ReservationDTO getReservationById(Long id) {
        Reservation reservation = repoReservation.findById(id).orElse(null);
        User user = userServiceClient.getUserById(reservation.getUserId());
        Vehicle vehicle = vehicleServiceClient.getVehicleById(reservation.getVehicleId());
        ReservationDTO reservationDTO = new ReservationDTO();
        reservationDTO.setStartDateTime(reservation.getStartDateTime());
        reservationDTO.setEndDateTime(reservation.getEndDateTime());
        reservationDTO.setStatus(reservation.getStatus());
        reservationDTO.setTotalAmount(reservation.getTotalAmount());
        reservationDTO.setUserFullname(user.getFullName());
        reservationDTO.setVehicle(vehicle.getMake()+" "
                +vehicle.getModel()+" "
                +vehicle.getYear()+" "
                +vehicle.getColor());
        return reservationDTO;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return repoReservation.findAll();
    }

    @Override
    public Reservation updateReservation(Long id, Reservation reservation) {
        Reservation reservationDb = repoReservation.findById(id).orElse(null);
        reservationDb.setUserId(reservation.getUserId());
        reservationDb.setVehicleId(reservation.getVehicleId());
        reservationDb.setStartDateTime(reservation.getStartDateTime());
        reservationDb.setEndDateTime(reservation.getEndDateTime());
        reservationDb.setStatus(reservation.getStatus());
        reservationDb.setTotalAmount(reservation.getTotalAmount());
        return repoReservation.save(reservationDb);
    }

    @Override
    public void deleteReservation(Long id) {
        repoReservation.deleteById(id);
    }

    @Override
    @CircuitBreaker(name="users-service", fallbackMethod = "fallbackGetUserById")
    @Retry(name="users-service")
    public User getUserById(Long userId) {
        return userServiceClient.getUserById(userId);
    }

    @Override
    @CircuitBreaker(name="vehicles-service", fallbackMethod = "fallbackGetVehicleById")
    @Retry(name="vehicles-service")
    public Vehicle getVehicleById(Long vehicleId) {
        return vehicleServiceClient.getVehicleById(vehicleId);
    }


    public User fallbackGetUserById(Throwable throwable){
        return new User(0L,"error", "error", "error", "error", "error", "error", "error");
    }
    public Vehicle fallbackGetVehicleById(Throwable throwable){
        return new Vehicle(0L, "error", "error", 0, "error", "error", 0.0, false, "error", "error");
    }
}
