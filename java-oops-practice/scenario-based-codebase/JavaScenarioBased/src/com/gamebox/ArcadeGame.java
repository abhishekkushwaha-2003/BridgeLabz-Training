package com.gamebox;

//Arcade game type
public class ArcadeGame extends Game {

 public ArcadeGame(String title, double price) {
     super(title, "Arcade", price);
 }

 // Polymorphism: arcade-style demo
 @Override
 public void playDemo() {
     System.out.println("Fast-paced arcade demo of " + title);
 }
}

