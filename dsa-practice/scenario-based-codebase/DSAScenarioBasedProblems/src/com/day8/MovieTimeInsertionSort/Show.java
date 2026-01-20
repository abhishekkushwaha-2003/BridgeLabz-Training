package com.day8.MovieTimeInsertionSort;

//Represents a movie show
public class Show {

 String movieName;   // Name of the movie
 int showTime;       // Time in 24-hour format 

 // Constructor
 public Show(String movieName, int showTime) {
     this.movieName = movieName;
     this.showTime = showTime;
 }

 // Display show details
 public void display() {
     System.out.println("Movie: " + movieName + ", Show Time: " + showTime);
 }
}
