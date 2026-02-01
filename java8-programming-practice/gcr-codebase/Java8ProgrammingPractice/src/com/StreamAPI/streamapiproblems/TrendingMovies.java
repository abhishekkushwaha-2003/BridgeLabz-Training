package com.StreamAPI.streamapiproblems;

import java.util.*;
import java.util.stream.Collectors;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    double getRating() { return rating; }
    int getYear() { return year; }

    public String toString() {
        return name + " (" + rating + ", " + year + ")";
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie RRR", 8.5, 2024),
                new Movie("Movie KGF", 7.8, 2023),
                new Movie("Movie JAWAN", 9.2, 2025),
                new Movie("Movie ANIMAL", 8.9, 2024),
                new Movie("Movie BORDER", 7.5, 2022),
                new Movie("Movie DANGAL", 9.0, 2025)
        );

        movies.stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed()
                        .thenComparing(Movie::getYear).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
