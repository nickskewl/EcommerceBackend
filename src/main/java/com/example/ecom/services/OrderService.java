package com.example.ecom.services;

import com.example.ecom.models.Order;
import com.example.ecom.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nitesh
 */
@Service
public class OrderService {

    @Autowired
    OrdersRepository orderRepository;

    public List<Order> getAllOrdersForUserId(String id) {
        return orderRepository.findAllOrdersForUserId(id);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAllOrders();
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }
}
