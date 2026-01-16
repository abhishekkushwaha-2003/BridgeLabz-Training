package com.day4.insertionsort.SmartShelf;

public class SmartShelfMain {

    // Insertion Sort by book title (A → Z)
    public static void insertionSortByTitle(Book[] books) {

        for (int i = 1; i < books.length; i++) {

            Book key = books[i];
            int j = i - 1;

            // Shift books that come after key alphabetically
            while (j >= 0 &&
                   books[j].title.compareToIgnoreCase(key.title) > 0) {

                books[j + 1] = books[j];
                j--;
            }

            // Place book at correct position
            books[j + 1] = key;
        }
    }

    public static void displayBooks(Book[] books) {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {

        Book[] readingList = {
            new Book("Java Basics", "James"),
            new Book("Algorithms", "Robert"),
            new Book("Data Structures", "Mark"),
            new Book("Android Development", "Linda")
        };

        System.out.println("Before Sorting:");
        displayBooks(readingList);

        insertionSortByTitle(readingList);

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        displayBooks(readingList);
    }
}
