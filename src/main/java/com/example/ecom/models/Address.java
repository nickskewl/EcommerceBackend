package com.example.ecom.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author nitesh
 */
@Getter
@Setter
public class Address {
    private String id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    @JsonProperty("isDefaultAddress")
    private boolean isDefaultAddress;
}
