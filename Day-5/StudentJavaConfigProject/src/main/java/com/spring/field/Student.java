package com.spring.field;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    @Autowired
    private Address address;

    public Student() {
    }

    public void display() {

        address.display();
    }
}