package com.joango.spring.data.access.service;

import com.joango.spring.data.access.dao.UserDAO;
import com.joango.spring.data.access.errors.EventError;
import com.joango.spring.data.access.errors.UserError;
import com.joango.spring.data.access.model.Event;
import com.joango.spring.data.access.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public User createUser(User user){
        return userDAO.save(user);
    }

    @Transactional(readOnly = true)
    public User findById(String id) throws Throwable {
        Optional<User> user = userDAO.findById(id);
        if(user.isPresent()){
            return user.get();
        } else {
            throw new UserError("User with id: " + id + "does not exist");
        }
    }

    @Transactional(readOnly = true)
    public User findByName(String name){
        return userDAO.findByName(name);
    }
}
