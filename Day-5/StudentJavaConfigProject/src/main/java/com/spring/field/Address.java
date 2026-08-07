package com.spring.field;

public class Address {

    private String city = "Delhi";
    private String state = "Delhi";

    public Address() {
    }

    public void display() {
        System.out.println("City  : " + city);
        System.out.println("State : " + state);
    }
}