package com.day7.BubbleSort.FitnessTracker;

//Contains sorting logic for FitnessTracker
public class FitnessTrackerClass {

 // Bubble Sort by step count (descending)
 public static void bubbleSortBySteps(User[] users) {

     int n = users.length; // Total users

     // Outer loop for number of passes
     for (int i = 0; i < n - 1; i++) {

         // Inner loop for adjacent comparison
         for (int j = 0; j < n - i - 1; j++) {

             // If current user has fewer steps than next user
             if (users[j].steps < users[j + 1].steps) {

                 // Swap users
                 User temp = users[j];
                 users[j] = users[j + 1];
                 users[j + 1] = temp;
             }
         }
     }
 }

 // Display leaderboard
 public static void displayLeaderboard(User[] users) {
     for (User u : users) {
         u.display();
     }
 }
}
