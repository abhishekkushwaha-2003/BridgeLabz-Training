package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Address address;

    public Student() {
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        address.display();
    }
}