package com.example.ecom.repository;

import com.example.ecom.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nitesh
 */
@Repository
public class UsersRepository {

    @Autowired
    DbHelper dbHelper;

    public List<User> findAllUsers() {
        return dbHelper.getAllEntities(User.class);
    }

    public User findUserById(String id) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("_id", id);
        return dbHelper.getOne(User.class, queryParams);
    }

    public void save(User user) {
        dbHelper.insert(user);
    }

    public void deleteAll() {
        dbHelper.delete(User.class, Collections.emptyMap());
    }

    public void deleteById(String id) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("_id", id);
        dbHelper.delete(User.class, queryParams);
    }
}
