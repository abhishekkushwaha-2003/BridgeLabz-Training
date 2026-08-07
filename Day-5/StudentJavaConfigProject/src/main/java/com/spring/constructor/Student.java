package com.spring.constructor;

public class Student {

    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void display() {
        address.display();
    }
}