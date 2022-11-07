package com.joango.spring.data.access.controller;

import com.joango.spring.data.access.exceptions.eventExceptions.EventException;
import com.joango.spring.data.access.exceptions.userExceptions.UserException;
import com.joango.spring.data.access.facade.BookingFacade;
import com.joango.spring.data.access.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    private BookingFacade bookingFacade;

    @PostMapping("/booking/buy")
    Ticket buyTicket(@RequestBody String eventId, @RequestBody String userId) throws UserException, EventException {
            return bookingFacade.bookTicket(eventId, userId);
    }

}
