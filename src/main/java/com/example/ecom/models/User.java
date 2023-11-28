package com.example.ecom.models;

import java.util.List;

/**
 * @author nitesh
 */
public class User {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private List<Address> addresses;
    private String defaultAddressId;
}
