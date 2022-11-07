package com.joango.spring.data.access.exceptions.ticketExceptions;

public class TicketNotFoundException extends Throwable{

    public TicketNotFoundException(String error){
        super(error);
    }
}
