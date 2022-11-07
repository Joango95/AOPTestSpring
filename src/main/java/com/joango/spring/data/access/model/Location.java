package com.joango.spring.data.access.model;

public class Location {

    private String id;
    private String address;
    private String city;
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
