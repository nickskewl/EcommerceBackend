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
@Document(collection = "User")
public class User {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private List<Address> addresses;
    private String defaultAddressId;
}
