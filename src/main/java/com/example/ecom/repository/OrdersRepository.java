package com.example.ecom.repository;

import com.example.ecom.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nitesh
 */
@Repository
public class OrdersRepository {

    @Autowired
    DbHelper dbHelper;

    public List<Order> findAllOrders() {
        return dbHelper.getAllEntities(Order.class);
    }

    public List<Order> findAllOrdersForUserId(String id) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("userId", id);
        return dbHelper.getAllEntities(Order.class, queryParams);
    }

    public void save(Order order) {
        dbHelper.insert(order);
    }
}
