package com.BagnBallOrganizer;

//create a class Ball to Represents a ball in the play school
public class Ball implements Storable {

 // Encapsulated fields
 private String ballId;
 private String color;
 private String size; 

 // Constructor
 public Ball(String ballId, String color, String size) {
     this.ballId = ballId;
     this.color = color;
     this.size = size;
 }

 // Getter
 public String getBallId() {
     return ballId;
 }

 // Display ball details
 @Override
 public void displayInfo() {
     System.out.println("Ball ID: " + ballId + ", Color: " + color + ", Size: " + size);
 }
}
