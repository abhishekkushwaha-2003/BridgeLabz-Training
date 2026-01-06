package com.fittrack;

//main application class
public class FitTrackApp {

 public static void main(String[] args) {

     // creating user profile
     UserProfile user = new UserProfile(
             "Abhishek", 22, 70.5, "Weight Loss");

     // displaying user details
     user.displayProfile();

     // daily calorie target
     int dailyTarget = 500;

     // cardio workout object
     Workout workout1 = new CardioWorkout(30);

     // starting workout
     workout1.startWorkout();

     // calculating calories using polymorphism
     workout1.calculateCalories(user.getWeight());

     // stopping workout
     workout1.stopWorkout();

     // calories burned
     int burned = workout1.getCaloriesBurned();
     System.out.println("Calories Burned: " + burned);

     // progress calculation using operators
     int remaining = dailyTarget - burned;
     System.out.println("Remaining Calories to Burn: " + remaining);

     System.out.println("-------------------------");

     // strength workout object
     Workout workout2 = new StrengthWorkout(40);

     workout2.startWorkout();
     workout2.calculateCalories(user.getWeight());
     workout2.stopWorkout();

     burned = workout2.getCaloriesBurned();
     System.out.println("Calories Burned: " + burned);

     remaining = dailyTarget - burned;
     System.out.println("Remaining Calories to Burn: " + remaining);
 }
}
