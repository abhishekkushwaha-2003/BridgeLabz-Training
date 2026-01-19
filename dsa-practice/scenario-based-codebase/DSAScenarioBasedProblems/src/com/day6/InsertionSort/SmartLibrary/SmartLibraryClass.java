package com.day6.InsertionSort.SmartLibrary;

//Contains sorting logic for SmartLibrary
public class SmartLibraryClass {

 // Insertion Sort based on book title (alphabetical order)
 public static void insertionSortByTitle(Book[] books) {

     // Start from second book
     for (int i = 1; i < books.length; i++) {

         Book key = books[i];  // Current book to be inserted
         int j = i - 1;

         // Shift books that come after the key alphabetically
         while (j >= 0 &&
                books[j].title.compareToIgnoreCase(key.title) > 0) {

             books[j + 1] = books[j];
             j--;
         }

         // Place the book at the correct position
         books[j + 1] = key;
     }
 }

 // Display all borrowed books
 public static void displayBooks(Book[] books) {
     for (Book b : books) {
         b.display();
     }
 }
}
