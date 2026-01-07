package com.linkedlist.doublylinkedlist.librarymanagementsystem;

class Library {

    private BookNode head;
    private BookNode tail;

    // Add book at beginning
    void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {

        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add book at end
    void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {

        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add book at specific position (1-based)
    void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {

        if (position <= 1) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        BookNode temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, bookId, isAvailable);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove book by Book ID
    void removeByBookId(int bookId) {

        BookNode temp = head;

        while (temp != null) {

            if (temp.bookId == bookId) {

                // If head node
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                    else
                        tail = null;
                }
                // If tail node
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                // Middle node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed successfully");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Search book by title or author
    void searchBook(String keyword) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.title.equalsIgnoreCase(keyword) ||
                temp.author.equalsIgnoreCase(keyword)) {

                displayBook(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching book found");
        }
    }

    // Update availability status
    void updateAvailability(int bookId, boolean status) {

        BookNode temp = head;

        while (temp != null) {

            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated successfully");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Display books forward
    void displayForward() {

        BookNode temp = head;

        if (temp == null) {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("Books (Forward Order):");

        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display books in reverse
    void displayReverse() {

        BookNode temp = tail;

        if (temp == null) {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("Books (Reverse Order):");

        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    int countBooks() {

        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Helper method to display book details
    private void displayBook(BookNode b) {
        System.out.println(
                "ID: " + b.bookId +
                " | Title: " + b.title +
                " | Author: " + b.author +
                " | Genre: " + b.genre +
                " | Available: " + (b.isAvailable ? "Yes" : "No")
        );
    }
}
