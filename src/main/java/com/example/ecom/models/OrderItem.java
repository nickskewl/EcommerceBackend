package com.example.ecom.models;

import lombok.Getter;
import lombok.Setter;

/**
 * @author nitesh
 */
@Getter
@Setter
public class OrderItem {
    private String productId;
    private int qty;
    private OrderStatus status;
}
