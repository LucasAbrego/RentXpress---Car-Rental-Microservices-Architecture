package com.rent_xpress.reservation.repository;

import com.rent_xpress.reservation.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "users-service")
public interface UserServiceClient {
    @GetMapping("/users/get/{id}")
    User getUserById(@PathVariable("id") Long id);
}
