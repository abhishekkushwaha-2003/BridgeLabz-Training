package com.day1.bookshelf;

public class LibraryOrganizerApp {

    public static void main(String[] args) {

        // Create BookShelf object
        BookShelf shelf = new BookShelf();

        // Add books
        shelf.addBook("Fiction", "Harry Potter");
        shelf.addBook("Fiction", "The Hobbit");
        shelf.addBook("Science", "A Brief History of Time");

        // Attempt duplicate
        shelf.addBook("Fiction", "Harry Potter");

        // Borrow a book
        shelf.borrowBook("Fiction", "Harry Potter");

        // Return a book
        shelf.returnBook("Fiction", "Harry Potter");

        // Display library
        shelf.displayLibrary();
    }
}

