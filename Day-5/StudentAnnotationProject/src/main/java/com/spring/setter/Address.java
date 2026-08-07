package com.spring.setter;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city = "Indore";
    private String state = "Madhya Pradesh";

    public Address() {
    }

    public void display() {
        System.out.println("City  : " + city);
        System.out.println("State : " + state);
    }
}