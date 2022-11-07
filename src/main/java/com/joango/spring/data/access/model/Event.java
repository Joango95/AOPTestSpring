package com.joango.spring.data.access.model;

import java.time.Instant;

public class Event {

    private String id;
    private String name;
    private Instant date;
    private Long duration;
    private Integer capacity;
    private Location Location;

    public Event(
        String id,
        String name,
        Instant date,
        Long duration,
        Integer capacity,
        Location location
    ) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.capacity = capacity;
        Location = location;
    }

    public Location getLocation() {
        return Location;
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
}
