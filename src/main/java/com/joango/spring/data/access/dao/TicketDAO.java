package com.joango.spring.data.access.dao;

import com.joango.spring.data.access.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDAO extends CrudRepository<Ticket, String> {
    Ticket findByEventId(String eventId);
    Ticket findByLocationId(String eventId);
}
