package com.joango.spring.data.access.service;

import com.joango.spring.data.access.dao.EventDAO;
import com.joango.spring.data.access.exceptions.eventExceptions.EventNotFoundException;
import com.joango.spring.data.access.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Component
public class EventService {

    @Autowired
    private EventDAO eventDAO;

    @Transactional
    public Event createEvent(Event event){
        return eventDAO.save(event);
    }

    @Transactional(readOnly = true)
    public Event findById(String id) throws EventNotFoundException {
        Optional<Event> event = eventDAO.findById(id);
        if(event.isPresent()){
            return event.get();
        } else {
            throw new EventNotFoundException("Event with id: " + id + " does not exist");
        }
    }

    @Transactional(readOnly = true)
    public Event findByName(String name){
        return eventDAO.findByName(name);
    }
}
