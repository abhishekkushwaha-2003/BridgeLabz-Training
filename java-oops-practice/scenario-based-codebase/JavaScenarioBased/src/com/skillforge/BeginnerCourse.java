package com.skillforge;

// Beginner level course
public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate(Student student) {

        if (student.getProgress() >= 100) {
            System.out.println("Beginner Certificate issued to " + student.name);
        } else {
            System.out.println("Course not completed yet");
        }
    }
}
