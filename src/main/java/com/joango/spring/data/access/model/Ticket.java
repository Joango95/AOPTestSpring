package com.joango.spring.data.access.model;

public class Ticket {

    private String id;
    private String eventId;
    private String locationId;
    private Integer price;

    public Ticket(String id, String eventId, String locationId, Integer price) {
        this.id = id;
        this.eventId = eventId;
        this.locationId = locationId;
        this.price = price;
    }

    public String getEventId() {
        return eventId;
    }

    public String getId() {
        return id;
    }

    public String getLocationId() {
        return locationId;
    }

    public Integer getPrice() {
        return price;
    }
}
