package com.example.ecom.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author nitesh
 */
@Getter
@Setter
@Document(collection = "Order")
public class Order {
    private String id;
    private List<OrderItem> products;
    private float totalPrice;
    private Address deliveryAddress;
    private String userId;
}
