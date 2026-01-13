package com.day2.trafficmanager;

// Node for Circular Linked List
class Vehicle {
    String plate;
    Vehicle next;

    Vehicle(String plate) {
        this.plate = plate;
        this.next = null;
    }
}