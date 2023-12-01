package com.example.ecom.models;

import lombok.Data;

/**
 * @author nitesh
 */
@Data
public class Address {
    private String id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private boolean isDefaultAddress;
}
