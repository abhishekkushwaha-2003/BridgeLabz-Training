package com.day11.AVLTree.GamingApp;

// Create a class to represents one player in the leaderboard

public class PlayerNode {

 int playerId;     
 int score;        
 int height;       
 PlayerNode left;   // left child
 PlayerNode right;  // right child

 // constructor to create new player
 public PlayerNode(int playerId, int score) {
     this.playerId = playerId;
     this.score = score;
     this.height = 1;   
 }
}
