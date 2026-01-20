package com.day8.GamerZoneQuickSort;

//Main class 
public class GamerZoneApp {

 public static void main(String[] args) {

     // Large & unsorted player score data (sample)
     Player[] players = {
         new Player("Abhishek", 1250),
         new Player("Rajeev", 1890),
         new Player("Karan", 980),
         new Player("Sonu", 1600),
         new Player("Rahul", 1420)
     };

     System.out.println("Before Ranking:");
     GamerZone.displayLeaderboard(players);

     // Quick Sort by score
     GamerZone.quickSort(players, 0, players.length - 1);

     System.out.println("\nGlobal Leaderboard (High Scores First):");
     GamerZone.displayLeaderboard(players);
 }
}
