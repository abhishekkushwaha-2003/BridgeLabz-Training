package com.day8.GamerZoneQuickSort;

//create a class which Contains Quick Sort logic for ranking players
public class GamerZone {

 // Quick Sort method
 public static void quickSort(Player[] players, int low, int high) {

     // Base condition
     if (low < high) {

         // Find correct position of pivot
         int pivotIndex = partition(players, low, high);

         // Sort left side
         quickSort(players, low, pivotIndex - 1);

         // Sort right side
         quickSort(players, pivotIndex + 1, high);
     }
 }

 // Partition method (based on score)
 private static int partition(Player[] players, int low, int high) {

     // Choose last player's score as pivot
     int pivotScore = players[high].score;
     int i = low - 1;

     // Rearrange players based on pivot
     for (int j = low; j < high; j++) {

         // Descending order (higher score first)
         if (players[j].score >= pivotScore) {
             i++;

             // Swap players[i] and players[j]
             Player temp = players[i];
             players[i] = players[j];
             players[j] = temp;
         }
     }

     // Place pivot at correct position
     Player temp = players[i + 1];
     players[i + 1] = players[high];
     players[high] = temp;

     return i + 1;
 }

 // Display leaderboard
 public static void displayLeaderboard(Player[] players) {
     for (Player p : players) {
         p.display();
     }
 }
}
