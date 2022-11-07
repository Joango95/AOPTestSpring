package com.joango.spring.data.access.service;

import com.joango.spring.data.access.dao.EventDAO;
import com.joango.spring.data.access.dao.TicketDAO;
import com.joango.spring.data.access.errors.EventError;
import com.joango.spring.data.access.errors.TicketError;
import com.joango.spring.data.access.model.Event;
import com.joango.spring.data.access.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class TicketService {

    @Autowired
    private TicketDAO ticketDAO;

    @Transactional
    public Ticket createEvent(Ticket ticket){
        return ticketDAO.save(ticket);
    }

    @Transactional(readOnly = true)
    public Ticket findById(String id) throws Throwable {
        Optional<Ticket> ticket = ticketDAO.findById(id);
        if(ticket.isPresent()){
            return ticket.get();
        } else {
            throw new TicketError("Ticket with id: " + id + "does not exist");
        }
    }

    @Transactional(readOnly = true)
    public Ticket findByEventId(String name){
        return ticketDAO.findByEventId(name);
    }
}