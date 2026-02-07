package com.DesignPatterns.SmartUniversityLibraryManagementSystem;
import java.util.*;

public class LibraryManagementSystemApp {
    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Builder
        Book book = new Book.BookBuilder("Data Structures")
                .authors(List.of("Cormen"))
                .edition("4th")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        catalog.addBook(book);

        // Factory
        User user = UserFactory.createUser("student");
        user.getPrivileges();

        // Observer
        NotificationService service = new NotificationService();
        service.registerObserver(new LibraryUser("Abhishek"));
        service.notifyObservers("Data Structures book is now available!");
    }
}
