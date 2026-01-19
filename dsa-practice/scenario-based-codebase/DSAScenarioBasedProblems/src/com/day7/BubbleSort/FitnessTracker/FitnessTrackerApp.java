package com.day7.BubbleSort.FitnessTracker;

//Main class – program execution starts here
public class FitnessTrackerApp {

 public static void main(String[] args) {

     // Small group of users (frequently updated data)
     User[] users = {
         new User("Abhishek", 8200),
         new User("Rajeev", 10500),
         new User("Karan", 7600),
         new User("Sonu", 9800),
         new User("Rahul", 8900)
     };

     // Before sorting
     System.out.println("Before Ranking:");
     FitnessTrackerClass.displayLeaderboard(users);

     // Sort users by steps using Bubble Sort
     FitnessTrackerClass.bubbleSortBySteps(users);

     // After sorting
     System.out.println("\nDaily Step Count Leaderboard:");
     FitnessTrackerClass.displayLeaderboard(users);
 }
}

