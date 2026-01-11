package com.day1.bookshelf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

// BookShelf system to manage library books
public class BookShelf {

    // HashMap to maintain genre-wise book list
    private HashMap<String, LinkedList<String>> library;

    // HashSet to avoid duplicate books
    private HashSet<String> uniqueBooks;

    // Constructor to initialize data structures
    public BookShelf() {
        library = new HashMap<>();
        uniqueBooks = new HashSet<>();
    }

    // Method to add a book to a genre
    public void addBook(String genre, String bookName) {

        // Check for duplicate book
        if (uniqueBooks.contains(bookName)) {
            System.out.println("Book already exists: " + bookName);
            return;
        }

        // Get the list of books for the genre
        // If genre does not exist, create new LinkedList
        library.putIfAbsent(genre, new LinkedList<>());

        // Add book to genre list
        library.get(genre).add(bookName);

        // Track book in HashSet
        uniqueBooks.add(bookName);

        System.out.println("Book added: " + bookName + " [" + genre + "]");
    }

    // Method to borrow (remove) a book
    public void borrowBook(String genre, String bookName) {

        // Check if genre exists
        if (!library.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        // Remove book from LinkedList
        boolean removed = library.get(genre).remove(bookName);

        if (removed) {
            uniqueBooks.remove(bookName);
            System.out.println("Book borrowed: " + bookName);
        } else {
            System.out.println("Book not available: " + bookName);
        }
    }

    // Method to return a book
    public void returnBook(String genre, String bookName) {

        // Prevent duplicate return
        if (uniqueBooks.contains(bookName)) {
            System.out.println("Book already present in library");
            return;
        }

        library.putIfAbsent(genre, new LinkedList<>());
        library.get(genre).add(bookName);
        uniqueBooks.add(bookName);

        System.out.println("Book returned: " + bookName);
    }

    // Method to display entire library
    public void displayLibrary() {

        System.out.println("\n Library Catalog:");

        for (String genre : library.keySet()) {
            System.out.println(genre + " → " + library.get(genre));
        }
    }
}

