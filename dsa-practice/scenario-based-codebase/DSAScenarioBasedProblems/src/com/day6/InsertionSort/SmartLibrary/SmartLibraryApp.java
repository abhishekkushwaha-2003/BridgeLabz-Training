package com.day6.InsertionSort.SmartLibrary;

//Main class – program execution starts here
public class SmartLibraryApp {

 public static void main(String[] args) {

     // Borrowed books list (nearly sorted)
     Book[] borrowedBooks = {
         new Book("Algorithms", "Robert"),
         new Book("Data Structures", "Mark"),
         new Book("Java Basics", "James"),
         new Book("Android Development", "Linda"),
         new Book("Cloud Computing", "Neha")
     };

     System.out.println("Before Sorting:");
     SmartLibraryClass.displayBooks(borrowedBooks);

     // Sort books alphabetically using Insertion Sort
     SmartLibraryClass.insertionSortByTitle(borrowedBooks);

     System.out.println("\nAfter Sorting (Alphabetical Order):");
     SmartLibraryClass.displayBooks(borrowedBooks);
 }
}
