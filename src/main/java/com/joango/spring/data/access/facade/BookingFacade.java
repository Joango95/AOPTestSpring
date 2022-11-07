package com.joango.spring.data.access.facade;

import com.joango.spring.data.access.exceptions.eventExceptions.EventNotFoundException;
import com.joango.spring.data.access.exceptions.userExceptions.UserNotFoundException;
import com.joango.spring.data.access.model.Event;
import com.joango.spring.data.access.model.Ticket;
import com.joango.spring.data.access.model.User;
import com.joango.spring.data.access.service.EventService;
import com.joango.spring.data.access.service.TicketService;
import com.joango.spring.data.access.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookingFacade {

    @Autowired
    private EventService eventService;

    @Autowired
    private UserService userService;

    @Autowired
    private TicketService ticketService;

    public Ticket bookTicket(String userId, String eventId) throws UserNotFoundException, EventNotFoundException {
        User user = userService.findById(userId);
        Event event = eventService.findById(eventId);
        if(user.getBalance() - event.getTicketPrice() > 0) {
            long numberOfSoldTickets = ticketService.countByEventId(eventId);
            long numberOfAvailableTickets = event.getCapacity() -numberOfSoldTickets;
            if(numberOfAvailableTickets > 0) {
                Ticket newTicket = new Ticket(eventId, userId);
                return ticketService.createTicket(newTicket);
            } else {
                throw new EventNotFoundException("No available tickets");
            }
        }
        else {
            throw new UserNotFoundException("Insufficient funds");
        }
    }
}
