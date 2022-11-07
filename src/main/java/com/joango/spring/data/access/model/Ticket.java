package com.joango.spring.data.access.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

public class Ticket {

    @Id
    @GeneratedValue
    private String id;
    @Column(name="eventId")
    private String eventId;
    @Column(name="userId")
    private String userId;
    @Column(name="seatNumber")
    private Integer seatNumber;

    public Ticket(
        String eventId,
        String userId
    ) {
        this.eventId = eventId;
        this.userId = userId;
    }

    public String getEventId() {
        return eventId;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }
}
