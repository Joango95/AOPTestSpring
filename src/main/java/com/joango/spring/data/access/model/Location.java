package com.joango.spring.data.access.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

public class Location {

    @Id
    @GeneratedValue
    private String id;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;

    public Location(String id, String address, String city, String country) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
