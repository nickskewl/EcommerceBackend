package com.example.ecom.repository;

import com.example.ecom.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author nitesh
 */
public interface UserRepository extends MongoRepository<User, String> {
    
}
