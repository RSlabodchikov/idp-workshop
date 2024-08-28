package com.slabodchikov.harness.registration.controller;

import com.slabodchikov.harness.registration.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/user")
    public ResponseEntity<String> registerEntity(UserDto userDto) {

        return ResponseEntity.ok("Registered");
    }
}
