package com.day6.InsertionSort.ArtExpo;

//Main class – program starts here
public class ArtExpoApp {

 public static void main(String[] args) {

     // Artists registering at different times
     Artist[] artists = {
         new Artist("Rajeev", 600),   // 10:00 AM
         new Artist("Abhishek", 540),  // 9:00 AM
         new Artist("Karan", 630),  // 10:30 AM
         new Artist("Mohit", 570),  // 9:30 AM
         new Artist("Sonu", 555)  // 9:15 AM
     };

     // displaying details before sorting
     System.out.println("Before Sorting:");
     ArtExpoClass.displayArtists(artists);

     // Sort artists by registration time
     ArtExpoClass.insertionSortByTime(artists);

     // displaying details after sorting
     System.out.println("\nAfter Sorting by Registration Time:");
     ArtExpoClass.displayArtists(artists);
 }
}
