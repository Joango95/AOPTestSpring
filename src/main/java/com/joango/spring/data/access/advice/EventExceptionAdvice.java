package com.joango.spring.data.access.advice;

import com.joango.spring.data.access.exceptions.eventExceptions.EventFullException;
import com.joango.spring.data.access.exceptions.eventExceptions.EventNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EventExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(EventNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String eventNotFoundHandler(EventNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(EventFullException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    String eventFullException(EventFullException ex) {
        return ex.getMessage();
    }
}
