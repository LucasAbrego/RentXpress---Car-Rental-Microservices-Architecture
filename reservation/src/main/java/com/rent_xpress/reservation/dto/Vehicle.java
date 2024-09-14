package com.rent_xpress.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Vehicle {
    private Long id;
    private String make;
    private String model;
    private int year;
    private String color;
    private String licensePlate;
    private double pricePerDay;
    private boolean availability;
    private String description;
    private String imageUrl;
}
