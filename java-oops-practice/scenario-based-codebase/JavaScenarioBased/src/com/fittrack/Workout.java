package com.fittrack;

//abstract workout class
abstract class Workout implements ITrackable {

 protected String type;
 protected int duration; // in minutes
 protected int caloriesBurned;

 // constructor
 public Workout(String type, int duration) {
     this.type = type;
     this.duration = duration;
 }

 // abstract method for calories calculation
 abstract void calculateCalories(double weight);

 // start workout
 public void startWorkout() {
     System.out.println(type + " workout started");
 }

 // stop workout
 public void stopWorkout() {
     System.out.println(type + " workout stopped");
 }

 // getter
 public int getCaloriesBurned() {
     return caloriesBurned;
 }
}
