package com.slabodchikov.harness.registration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<Void> getStatus() {

        return ResponseEntity.ok().build();
    }
}
