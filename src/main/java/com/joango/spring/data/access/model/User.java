package com.joango.spring.data.access.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

public class User {

    @Id
    @GeneratedValue
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="balance")
    private Long balance;

    public User(String id, String name, Long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getBalance() {
        return balance;
    }
}
