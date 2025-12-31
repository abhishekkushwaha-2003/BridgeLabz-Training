package com.objectmodelingandobjectdiagram.selfproblem;

public class Faculty {

    // faculty attributes
    String facultyName;
    String subject;

    // constructor
    Faculty(String facultyName, String subject) {
        this.facultyName = facultyName;
        this.subject = subject;
    }

    // method to display faculty details
    void showFaculty() {
        System.out.println("Faculty Name: " + facultyName +
                           ", Subject: " + subject);
    }
}

