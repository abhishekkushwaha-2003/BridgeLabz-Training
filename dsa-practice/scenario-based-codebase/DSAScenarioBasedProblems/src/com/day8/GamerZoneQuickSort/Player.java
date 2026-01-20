package com.day8.GamerZoneQuickSort;

//create a class Player which Represents a player in GamerZone
public class Player {

 String playerName;  // Player name
 int score;          // Player score

 // Constructor
 public Player(String playerName, int score) {
     this.playerName = playerName;
     this.score = score;
 }

 // Display player details
 public void display() {
     System.out.println(
         "Player: " + playerName +
         ", Score: " + score
     );
 }
}
