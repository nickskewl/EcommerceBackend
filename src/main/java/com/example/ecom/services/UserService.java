package com.example.ecom.services;

import com.example.ecom.models.Address;
import com.example.ecom.models.Order;
import com.example.ecom.models.User;
import com.example.ecom.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author nitesh
 */
@Service
public class UserService {

    @Autowired
    UsersRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAllUsers();
    }

    public User getUserById(String id) {
        return userRepository.findUserById(id);
    }

    public User createUser(User user) {
        List<Address> addresses = user.getAddresses();
        addresses.forEach(address -> {
            address.setId(UUID.randomUUID().toString());
            if (address.isDefaultAddress()) {
                user.setDefaultAddressId(address.getId());
            }
        });
        userRepository.save(user);
        return user;
    }

    public void deleteAllUser() {
        userRepository.deleteAll();
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

}
