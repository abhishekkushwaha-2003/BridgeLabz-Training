package com.gamebox;
//Parent class for all games
public class Game implements IDownloadable {

 protected String title;
 protected String genre;
 protected double price;
 protected double rating;

 // Constructor for paid games
 public Game(String title, String genre, double price) {
     this.title = title;
     this.genre = genre;
     this.price = price;
     this.rating = 0.0;
 }

 // Constructor for free games
 public Game(String title, String genre) {
     this(title, genre, 0.0);
 }

 // Apply seasonal discount using operators
 public void applyDiscount(double percent) {
     price = price - (price * percent / 100);
 }

 @Override
 public void download() {
     System.out.println(title + " downloaded successfully");
 }

 // Default demo behavior (will be overridden)
 @Override
 public void playDemo() {
     System.out.println("Playing demo of " + title);
 }

 public double getPrice() {
     return price;
 }

 public String getTitle() {
     return title;
 }
}
