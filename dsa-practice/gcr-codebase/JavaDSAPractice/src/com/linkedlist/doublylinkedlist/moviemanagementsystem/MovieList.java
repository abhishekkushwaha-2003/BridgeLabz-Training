package com.linkedlist.doublylinkedlist.moviemanagementsystem;

class MovieList {

    private MovieNode head;
    private MovieNode tail;

    // add movie at beginning
    void addAtBeginning(String title, String director, int year, double rating) {

        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add movie at end
    void addAtEnd(String title, String director, int year, double rating) {

        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // add movie at specific position (1-based index)
    void addAtPosition(int position, String title, String director, int year, double rating) {

        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // remove movie by title
    void removeByTitle(String title) {

        MovieNode temp = head;

        while (temp != null) {

            if (temp.title.equalsIgnoreCase(title)) {

                // if head node
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                    else
                        tail = null;
                }
                // if tail node
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                // middle node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed successfully");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // search movie by director or rating
    void searchMovie(String director, double rating) {

        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching movie found");
        }
    }

    // update rating by movie title
    void updateRating(String title, double newRating) {

        MovieNode temp = head;

        while (temp != null) {

            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // display movies forward
    void displayForward() {

        MovieNode temp = head;

        if (temp == null) {
            System.out.println("No movies available");
            return;
        }

        System.out.println("Movies (Forward Order):");

        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // display movies in reverse
    void displayReverse() {

        MovieNode temp = tail;

        if (temp == null) {
            System.out.println("No movies available");
            return;
        }

        System.out.println("Movies (Reverse Order):");

        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // helper method to print movie details
    private void displayMovie(MovieNode m) {
        System.out.println(
                m.title + " | " +
                m.director + " | " +
                m.year + " | Rating: " +
                m.rating
        );
    }
}
