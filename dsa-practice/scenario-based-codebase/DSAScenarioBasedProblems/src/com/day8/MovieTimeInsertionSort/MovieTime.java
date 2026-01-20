package com.day8.MovieTimeInsertionSort;

//Contains sorting logic for MovieTime
public class MovieTime {

 // Insertion Sort based on show time (ascending)
 public static void insertionSortByTime(Show[] shows) {

     // Start from second element
     for (int i = 1; i < shows.length; i++) {

         Show key = shows[i];   // New show to insert
         int j = i - 1;

         // Shift shows that start later than key
         while (j >= 0 && shows[j].showTime > key.showTime) {
             shows[j + 1] = shows[j];
             j--;
         }

         // Insert show at correct position
         shows[j + 1] = key;
     }
 }

 // Display all shows
 public static void displayShows(Show[] shows) {
     for (Show s : shows) {
         s.display();
     }
 }
}
