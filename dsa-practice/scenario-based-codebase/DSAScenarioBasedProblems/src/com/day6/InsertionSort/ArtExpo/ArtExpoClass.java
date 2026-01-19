package com.day6.InsertionSort.ArtExpo;

//Contains sorting logic for ArtExpo
public class ArtExpoClass {

 // Insertion Sort by registration time (ascending)
 public static void insertionSortByTime(Artist[] artists) {

     // Start from second element
     for (int i = 1; i < artists.length; i++) {

         Artist key = artists[i]; // Current artist
         int j = i - 1;

         // Shift artists who registered later than key
         while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
             artists[j + 1] = artists[j];
             j--;
         }

         // Insert artist at correct position
         artists[j + 1] = key;
     }
 }

 // Display all artists
 public static void displayArtists(Artist[] artists) {
     for (Artist a : artists) {
         a.display();
     }
 }
}
