package com.joango.spring.data.access.exceptions.userExceptions;

public class UserNotFoundException extends UserException {

    public UserNotFoundException(String user){
        super("User: " + user + " not found");
    }
}
