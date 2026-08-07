package com.spring.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Address address;

    @Autowired
    public Student(Address address) {
        this.address = address;
    }

    public void display() {
        address.display();
    }
}