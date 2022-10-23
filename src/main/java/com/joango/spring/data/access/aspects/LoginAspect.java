package com.joango.spring.data.access.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    @Before("execution(public void insertClient())")
    public void beforeInsertingClient(){
        System.out.println("BEFORE INSERTING CLIENT");
    }
}
