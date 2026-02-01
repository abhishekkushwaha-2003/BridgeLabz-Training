package com.Collectors.LibraryBookStatistics;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryStatistics{
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Book1", "Fiction", 300),
            new Book("Book2", "Fiction", 450),
            new Book("Book3", "Science", 500),
            new Book("Book4", "Science", 350)
        );

        Map<String, IntSummaryStatistics> stats =
            books.stream()
                .collect(Collectors.groupingBy(
                    Book::getGenre,
                    Collectors.summarizingInt(Book::getPages)
                ));

        stats.forEach((genre, s) -> {
            System.out.println(genre);
            System.out.println("Total Pages: " + s.getSum());
            System.out.println("Average Pages: " + s.getAverage());
            System.out.println("Max Pages: " + s.getMax());
            System.out.println();
        });
    }
}
