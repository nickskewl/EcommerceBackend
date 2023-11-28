package com.example.ecom.models;

import java.util.List;

/**
 * @author nitesh
 */
public class Order {
    private String id;
    private List<OrderItem> products;
    private float totalPrice;
    private Address deliveryAddress;
    private OrderStatus status;
}
