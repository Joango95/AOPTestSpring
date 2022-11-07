package com.joango.spring.data.access.dao;

import com.joango.spring.data.access.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDAO extends CrudRepository<Event, String> {
    Event findByName(String name);
}
