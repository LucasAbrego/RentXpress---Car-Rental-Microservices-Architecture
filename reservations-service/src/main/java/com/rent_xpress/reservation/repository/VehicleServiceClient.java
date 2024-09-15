package com.rent_xpress.reservation.repository;

import com.rent_xpress.reservation.dto.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "vehicles-service")
public interface VehicleServiceClient {
    @GetMapping("/vehicles/get/{id}")
    Vehicle getVehicleById(@PathVariable("id") Long id);
}
