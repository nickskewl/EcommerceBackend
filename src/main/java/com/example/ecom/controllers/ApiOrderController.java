package com.example.ecom.controllers;

import com.example.ecom.models.Order;
import com.example.ecom.models.User;
import com.example.ecom.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nitesh
 */
@RestController
@RequestMapping("/api")
public class ApiOrderController {

    @Autowired
    OrderService service;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/users/{id}/orders")
    public List<Order> getAllOrdersForUserId(@PathVariable String id) {
        return service.getAllOrdersForUserId(id);
    }

    @PostMapping("/orders")
    public ResponseEntity<User> createOrder(@RequestBody Order order) {
        service.createOrder(order);
        return ResponseEntity.created(null).build();
    }
}
