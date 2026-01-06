package com.fittrack;

//user profile class
class UserProfile {

 private String name;
 private int age;
 private double weight;   // private health data
 private String goal;

 // constructor with custom goal
 public UserProfile(String name, int age, double weight, String goal) {
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = goal;
 }

 // constructor with default goal
 public UserProfile(String name, int age, double weight) {
     this(name, age, weight, "Stay Fit");
 }

 // getter only (no direct access to weight)
 public double getWeight() {
     return weight;
 }

 // display user info
 public void displayProfile() {
     System.out.println("User: " + name + ", Goal: " + goal);
 }
}
