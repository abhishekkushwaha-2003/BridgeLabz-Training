package com.fittrack;

//strength workout class
class StrengthWorkout extends Workout {

 public StrengthWorkout(int duration) {
     super("Strength", duration);
 }

 // different calorie logic
 void calculateCalories(double weight) {
     caloriesBurned = (int) (duration * weight * 0.08);
 }
}
