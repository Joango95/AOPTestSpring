package com.joango.spring.data.access.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.time.Instant;

public class Event {

    @Id
    @GeneratedValue
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="date")
    private Instant date;
    @Column(name="duration")
    private Long duration;
    @Column(name="capacity")
    private Integer capacity;
    @Column(name="location")
    private Location location;
    @Column(name="ticketPrice")
    private Long ticketPrice;

    public Event(
        String id,
        String name,
        Instant date,
        Long duration,
        Integer capacity,
        Location location,
        Long ticketPrice
    ) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.capacity = capacity;
        this.location = location;
        this.ticketPrice = ticketPrice;
    }

    public Location getLocation() {
        return location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Long getDuration() {
        return duration;
    }

    public Instant getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Long getTicketPrice() {
        return ticketPrice;
    }
}
