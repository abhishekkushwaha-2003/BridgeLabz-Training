package com.day7.BubbleSort.FitnessTracker;

//Create a class User to Represents a fitness app user
public class User {

 String userName;   // Name of the user
 int steps;         // Daily step count

 // Constructor
 public User(String userName, int steps) {
     this.userName = userName;
     this.steps = steps;
 }

 // Display user details
 public void display() {
     System.out.println(
         "User: " + userName +
         ", Steps: " + steps
     );
 }
}
