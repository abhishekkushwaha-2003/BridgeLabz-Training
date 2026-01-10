package com.skillforge;

public class SkillForgeApp {

    // Program starts here
    public static void main(String[] args) {

        // Create instructor
        Instructor instructor = new Instructor("Rahul Verma");

        // Create student
        Student student = new Student("Ankit");

        // Create beginner course
        Course course = new BeginnerCourse(
                "Java Fundamentals",
                instructor.name
        );

        // Instructor uploads course
        instructor.uploadCourse(course);

        // Student completes course
        student.updateProgress(3, 3);

        // Generate certificate (polymorphism)
        course.generateCertificate(student);
    }
}
