package com.gamebox;

import java.util.ArrayList;

//Represents a GameBox user
public class User {

 private String username;
 private ArrayList<Game> ownedGames;

 public User(String username) {
     this.username = username;
     this.ownedGames = new ArrayList<>();
 }

 // Encapsulation: controlled access to owned games
 public void buyGame(Game game) {
     ownedGames.add(game);
     System.out.println(username + " purchased " + game.getTitle());
 }

 public void showOwnedGames() {
     System.out.println("Games owned by " + username + ":");
     for (Game g : ownedGames) {
         System.out.println("- " + g.getTitle());
     }
 }
}
