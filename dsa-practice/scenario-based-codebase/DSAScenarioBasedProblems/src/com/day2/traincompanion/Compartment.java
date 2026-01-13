package com.day2.traincompanion;

//Node representing a train compartment
class Compartment {

 String name;          // Compartment name/number
 String service;       // Service available (Pantry, WiFi, None)
 Compartment prev;     // Previous compartment
 Compartment next;     // Next compartment

 // Constructor
 Compartment(String name, String service) {
     this.name = name;
     this.service = service;
     this.prev = null;
     this.next = null;
 }
}
