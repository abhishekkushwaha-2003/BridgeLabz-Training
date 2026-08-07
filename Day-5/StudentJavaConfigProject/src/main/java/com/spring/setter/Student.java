package com.spring.setter;

public class Student {

    private Address address;

    public Student() {
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        address.display();
    }
}