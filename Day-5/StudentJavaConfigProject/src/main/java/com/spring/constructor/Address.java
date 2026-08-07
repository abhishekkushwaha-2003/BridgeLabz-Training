package com.spring.constructor;

public class Address {

    private String city;
    private String state;

    public Address() {
        this.city = "Bhopal";
        this.state = "Madhya Pradesh";
    }

    public void display() {
        System.out.println("City  : " + city);
        System.out.println("State : " + state);
    }
}