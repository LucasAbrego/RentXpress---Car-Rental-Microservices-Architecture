package com.rent_xpress.reservation.dto;

import com.rent_xpress.reservation.model.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class ReservationDTO {
    private String userFullname;
    private String vehicle;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String status;
    private double totalAmount;
}
