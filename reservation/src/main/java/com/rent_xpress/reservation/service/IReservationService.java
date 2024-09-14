package com.rent_xpress.reservation.service;

import com.rent_xpress.reservation.dto.ReservationDTO;
import com.rent_xpress.reservation.dto.User;
import com.rent_xpress.reservation.dto.Vehicle;
import com.rent_xpress.reservation.model.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation reservation);

    ReservationDTO getReservationById(Long id);

    List<Reservation> getAllReservations();

    Reservation updateReservation(Long id, Reservation reservation);

    void deleteReservation(Long id);
    

    User getUserById(Long userId);

    Vehicle getVehicleById(Long vehicleId);
}
