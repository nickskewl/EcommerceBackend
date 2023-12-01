package com.example.ecom.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nitesh
 */
@RestController
@RequestMapping("/")
public class ApiHeartbeatController {

    @GetMapping
    public String getHeartbeat() {
        return "Service is live.";
    }
}
