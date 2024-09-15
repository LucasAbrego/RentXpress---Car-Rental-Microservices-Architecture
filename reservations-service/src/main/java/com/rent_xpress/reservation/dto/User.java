package com.rent_xpress.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String fullName;
    private String address;
    private String registrationDate;
}
