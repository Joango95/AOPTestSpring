package com.joango.spring.data.access.service;

import com.joango.spring.data.access.dao.UserDAO;
import com.joango.spring.data.access.exceptions.userExceptions.UserNotFoundException;
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
    public User findById(String id) throws UserNotFoundException {
        Optional<User> user = userDAO.findById(id);
        if(user.isPresent()){
            return user.get();
        } else {
            throw new UserNotFoundException("User with id: " + id + " does not exist");
        }
    }

    @Transactional(readOnly = true)
    public User findByName(String name){
        return userDAO.findByName(name);
    }


}
