package com.joango.spring.data.access.dao;

import com.joango.spring.data.access.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketDAO extends CrudRepository<Ticket, String> {
    List <Ticket> findByEventId(String eventId);
    List<Ticket> findByUserId(String userId);
    Optional<Ticket> findByEventIdAndUserId(String eventId, String userId);
    long countByEventId(String eventId);
}
