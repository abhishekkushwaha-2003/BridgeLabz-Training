package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        // Adding books
        library.addAtBeginning("Java Basics", "James Gosling", "Programming", 101, true);
        library.addAtEnd("Clean Code", "Robert Martin", "Software", 102, true);
        library.addAtEnd("Data Structures", "Mark Allen", "CS", 103, false);
        library.addAtPosition(2, "Python Guide", "Guido van Rossum", "Programming", 104, true);

        System.out.println("----------------");

        library.displayForward();

        System.out.println("----------------");

        library.displayReverse();

        System.out.println("----------------");

        library.searchBook("Robert Martin");

        System.out.println("----------------");

        library.updateAvailability(103, true);

        System.out.println("----------------");

        library.removeByBookId(102);

        System.out.println("----------------");

        library.displayForward();

        System.out.println("----------------");

        System.out.println("Total Books: " + library.countBooks());
    }
}
