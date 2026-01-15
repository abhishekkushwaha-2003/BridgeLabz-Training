package com.gamebox;

//Main class to test GameBox platform
public class GameBoxApp {

 public static void main(String[] args) {

     User user = new User("Abhishek");

     Game arcadeGame = new ArcadeGame("Speed Racer", 299);
     Game strategyGame = new StrategyGame("War Planner", 499);

     // Seasonal offer
     strategyGame.applyDiscount(20);

     arcadeGame.download();
     arcadeGame.playDemo();

     System.out.println();

     strategyGame.download();
     strategyGame.playDemo();

     System.out.println();

     user.buyGame(arcadeGame);
     user.buyGame(strategyGame);

     System.out.println();
     user.showOwnedGames();
 }
}
