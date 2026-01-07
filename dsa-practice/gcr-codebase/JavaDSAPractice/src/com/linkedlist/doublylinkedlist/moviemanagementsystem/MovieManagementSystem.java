package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManagementSystem {

    public static void main(String[] args) {

        MovieList list = new MovieList();

        // adding movies
        list.addAtBeginning("Jawan", "12th Fail", 2023, 8.8);
        list.addAtEnd("RRR", "Kantara", 2022, 8.6);
        list.addAtEnd("Avatar", "James Cameron", 2009, 7.9);
        list.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.8);

        System.out.println("----------------");

        list.displayForward();

        System.out.println("----------------");

        list.displayReverse();

        System.out.println("----------------");

        list.searchMovie("Christopher Nolan", 0);

        System.out.println("----------------");

        list.updateRating("Avatar", 8.1);

        System.out.println("----------------");

        list.removeByTitle("Titanic");

        System.out.println("----------------");

        list.displayForward();
    }
}
