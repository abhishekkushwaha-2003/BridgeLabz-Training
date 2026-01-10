package com.skillforge;

// Instructor class
public class Instructor extends User {

    public Instructor(String name) {
        super(name);
    }

    // Upload course
    public void uploadCourse(Course course) {
        System.out.println("Course uploaded by instructor: " + name);
    }
}
