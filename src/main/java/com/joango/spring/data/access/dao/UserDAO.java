package com.joango.spring.data.access.dao;

import com.joango.spring.data.access.model.Event;
import com.joango.spring.data.access.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, String> {
    User findByName(String name);
}
