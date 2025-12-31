package com.objectmodelingandobjectdiagram.assistedproblem;

import java.util.ArrayList;

public class Library {

    // Library has a collection of Books
    ArrayList<Book> books = new ArrayList<>();

    // method to add book to library
    void addBook(Book book) {
        books.add(book);
    }

    // method to display all books in library
    void showBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }
}

