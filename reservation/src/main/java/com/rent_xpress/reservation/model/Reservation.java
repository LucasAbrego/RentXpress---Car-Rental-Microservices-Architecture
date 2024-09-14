package com.rent_xpress.reservation.model;

import com.rent_xpress.reservation.dto.ReservationDTO;
import com.rent_xpress.reservation.dto.User;
import com.rent_xpress.reservation.dto.Vehicle;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long vehicleId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String status;
    private double totalAmount;
}
