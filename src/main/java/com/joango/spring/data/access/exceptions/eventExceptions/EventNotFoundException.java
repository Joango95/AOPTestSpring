package com.joango.spring.data.access.exceptions.eventExceptions;

public class EventNotFoundException extends EventException {

    public EventNotFoundException(String id){
        super("Event: " + id + "not found");
    }
}
