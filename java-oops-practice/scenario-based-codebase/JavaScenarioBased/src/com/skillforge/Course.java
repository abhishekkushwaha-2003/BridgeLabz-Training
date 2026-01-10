package com.skillforge;

import java.util.ArrayList;
import java.util.List;

// Abstract Course class
public abstract class Course implements ICertifiable {

    protected String title;
    protected String instructor;
    protected double rating;
    protected List<String> modules;

    // Internal reviews (read-only outside)
    private List<String> reviews;

    // Constructor with default modules
    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
        this.reviews = new ArrayList<>();

        modules.add("Introduction");
        modules.add("Core Concepts");
        modules.add("Final Project");
    }

    // Constructor with custom modules
    public Course(String title, String instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new ArrayList<>();
    }

    // Protected rating logic
    protected void calculateRating(int stars) {
        this.rating = (this.rating + stars) / 2;
    }

    // Add review internally
    public void addReview(String review) {
        reviews.add(review);
    }

    // Read-only reviews access
    public List<String> getReviews() {
        return List.copyOf(reviews);
    }

    // 🔴 IMPORTANT: abstract method declaration
    @Override
    public abstract void generateCertificate(Student student);
}
