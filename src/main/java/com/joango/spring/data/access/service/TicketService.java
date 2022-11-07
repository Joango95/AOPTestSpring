package com.joango.spring.data.access.service;

import com.joango.spring.data.access.dao.TicketDAO;
import com.joango.spring.data.access.exceptions.ticketExceptions.TicketNotFoundException;
import com.joango.spring.data.access.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class TicketService {

    @Autowired
    private TicketDAO ticketDAO;

    @Transactional
    public Ticket createTicket(Ticket ticket){
        return ticketDAO.save(ticket);
    }

    @Transactional(readOnly = true)
    public Ticket findById(String id) throws Throwable {
        Optional<Ticket> ticket = ticketDAO.findById(id);
        if(ticket.isPresent()){
            return ticket.get();
        } else {
            throw new TicketNotFoundException("Ticket with id: " + id + " does not exist");
        }
    }

    @Transactional(readOnly = true)
    public List<Ticket> findByEventId(String eventId){
        return ticketDAO.findByEventId(eventId);
    }

    @Transactional(readOnly = true)
    public List<Ticket> findByUserId(String userId){
        return ticketDAO.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public Ticket findByEventIdAndUserId(String eventId, String userId) throws TicketNotFoundException {
        Optional<Ticket> ticket = ticketDAO.findByEventIdAndUserId(eventId, userId);
        if(ticket.isPresent()){
            return ticket.get();
        } else {
            throw new TicketNotFoundException("Ticket for eventId: " + eventId + "and userId: " + userId + " does not exist");
        }
    }

    @Transactional(readOnly = true)
    public long countByEventId(String eventId) {
        return ticketDAO.countByEventId(eventId);
    }
}