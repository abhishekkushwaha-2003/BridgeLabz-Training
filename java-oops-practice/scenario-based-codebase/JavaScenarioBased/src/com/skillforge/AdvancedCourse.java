package com.skillforge;

import java.util.List;

// Advanced level course
public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, String instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {

        if (student.getProgress() >= 100) {
            System.out.println(
                "Advanced Professional Certificate issued to " + student.name
            );
        } else {
            System.out.println("Course not completed yet");
        }
    }
}
