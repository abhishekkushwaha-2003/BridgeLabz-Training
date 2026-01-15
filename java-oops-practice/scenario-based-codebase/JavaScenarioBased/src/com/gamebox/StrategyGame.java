package com.gamebox;

//Strategy game type
public class StrategyGame extends Game {

 public StrategyGame(String title, double price) {
     super(title, "Strategy", price);
 }

 // Polymorphism: strategy-style demo
 @Override
 public void playDemo() {
     System.out.println("Thinking-based strategy demo of " + title);
 }
}
