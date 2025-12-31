package com.objectmodelingandobjectdiagram.assistedproblem;

public class Book {

    // attributes of Book
    String title;
    String author;

    // constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // method to display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

