package com.day6.InsertionSort.ArtExpo;

// create a class Artist
public class Artist {

 String name;            // Artist name
 int registrationTime;   // Time in minutes (e.g., 540 = 9:00 AM)

 // Constructor
 public Artist(String name, int registrationTime) {
     this.name = name;
     this.registrationTime = registrationTime;
 }

 // Display artist details
 public void display() {
     System.out.println(
         "Artist: " + name +
         ", Registration Time: " + registrationTime
     );
 }
}
