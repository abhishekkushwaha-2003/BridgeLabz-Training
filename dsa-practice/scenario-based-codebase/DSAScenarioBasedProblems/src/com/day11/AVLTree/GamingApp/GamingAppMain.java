package com.day11.AVLTree.GamingApp;

//Main class

public class GamingAppMain {

 public static void main(String[] args) {

     LeaderboardAVL leaderboard = new LeaderboardAVL();

     // inserting players
     leaderboard.addOrUpdatePlayer(101, 1200);
     leaderboard.addOrUpdatePlayer(102, 800);
     leaderboard.addOrUpdatePlayer(103, 1500);
     leaderboard.addOrUpdatePlayer(104, 600);
     leaderboard.addOrUpdatePlayer(105, 950);

     System.out.println("Top Players:");
     leaderboard.displayTopPlayers();

     // removing a player
     System.out.println("\nAfter removing player with score 800:");
     leaderboard.removePlayer(800);
     leaderboard.displayTopPlayers();
 }
}
