package com.example.ecom.repository;

import com.example.ecom.models.Order;
import com.example.ecom.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
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
    MongoTemplate mongoTemplate;

    public List<Order> findAllOrders() {
        return DbUtil.getAllEntities(Order.class);
    }

    public List<Order> findAllOrdersForUserId(String id) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("userId", id);

        return DbUtil.getAllEntities(Order.class, queryParams);
    }

    public void save(Order order) {
        DbUtil.insert(order);
    }
}
