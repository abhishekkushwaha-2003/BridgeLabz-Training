package com.BagnBallOrganizer;

import java.util.ArrayList;

//Create a class Bad to Represents a bag that holds balls
public class Bag implements Storable {

 // Encapsulated fields
 private String bagId;
 private String color;
 private int capacity;

 // Composition: Bag HAS-A list of balls
 private ArrayList<Ball> balls;

 // Constructor
 public Bag(String bagId, String color, int capacity) {
     this.bagId = bagId;
     this.color = color;
     this.capacity = capacity;
     this.balls = new ArrayList<>();
 }

 // Add a ball to the bag
 public void addBall(Ball ball) {

     // Check capacity before adding
     if (balls.size() < capacity) {
         balls.add(ball);
         System.out.println("Ball added to Bag " + bagId);
     } else {
         System.out.println("Bag " + bagId + " is FULL. Cannot add more balls.");
     }
 }

 // Remove a ball by ID
 public void removeBall(String ballId) {

     for (Ball b : balls) {
         if (b.getBallId().equals(ballId)) {
             balls.remove(b);
             System.out.println("Ball " + ballId + " removed from Bag " + bagId);
             return;
         }
     }

     System.out.println("Ball not found in Bag " + bagId);
 }

 // Display all balls in the bag
 public void displayBalls() {
     System.out.println("Balls in Bag " + bagId + ":");

     if (balls.isEmpty()) {
         System.out.println("No balls in this bag.");
     }

     for (Ball b : balls) {
         b.displayInfo();
     }
 }

 // Display bag summary
 @Override
 public void displayInfo() {
     System.out.println("Bag ID: " + bagId + ", Color: " + color + ", Capacity: " + capacity + ", Balls Stored: " + balls.size());
 }
}
