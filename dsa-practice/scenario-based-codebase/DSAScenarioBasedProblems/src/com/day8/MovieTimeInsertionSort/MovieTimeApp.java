package com.day8.MovieTimeInsertionSort;

//Main class 
public class MovieTimeApp {

 public static void main(String[] args) {

     // Nearly sorted list of shows
     Show[] shows = {
         new Show("Avengers", 1200),
         new Show("Inception", 1400),
         new Show("Interstellar", 1600),
         new Show("Jumanji", 1500),   // Added later
         new Show("Titanic", 1800)
     };

     System.out.println("Before Sorting:");
     MovieTime.displayShows(shows);

     // Sort shows by time
     MovieTime.insertionSortByTime(shows);

     System.out.println("\nAfter Sorting by Show Time:");
     MovieTime.displayShows(shows);
 }
}
