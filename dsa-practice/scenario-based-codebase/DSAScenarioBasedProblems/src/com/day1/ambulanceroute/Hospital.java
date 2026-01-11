package com.day1.ambulanceroute;

//Node representing a hospital unit
class Hospital{

 String name;                 // Unit name
 boolean isAvailable;         // Availability status
 Hospital next;           // Pointer to next unit

 // Constructor
 Hospital(String name, boolean isAvailable) {
     this.name = name;
     this.isAvailable = isAvailable;
     this.next = null;
 }
}
