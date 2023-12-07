package com.example.ecom.repository;

import com.example.ecom.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
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
    MongoTemplate mongoTemplate;

    public List<User> findAllUsers() {
        return DbUtil.getAllEntities(User.class);
    }

    public User findUserById(String id) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("_id", id);
        return DbUtil.getOne(User.class, queryParams);
    }

    public void save(User user) {
        DbUtil.insert(user);
    }

    public void deleteAll() {
        DbUtil.delete(User.class, Collections.emptyMap());
    }

    public void deleteById(String id) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("_id", id);
        DbUtil.delete(User.class, queryParams);
    }
}
