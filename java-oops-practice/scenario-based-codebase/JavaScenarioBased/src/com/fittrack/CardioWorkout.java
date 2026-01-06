package com.fittrack;

//cardio workout class
class CardioWorkout extends Workout {

 public CardioWorkout(int duration) {
     super("Cardio", duration);
 }

 // different calorie logic
 void calculateCalories(double weight) {
     caloriesBurned = (int) (duration * weight * 0.1);
 }
}

