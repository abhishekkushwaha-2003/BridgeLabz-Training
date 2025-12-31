package com.objectmodelingandobjectdiagram.selfproblem;

public class Professor {

    // professor name
    String professorName;

    // constructor
    Professor(String professorName) {
        this.professorName = professorName;
    }

    // method to show professor details
    void showProfessor() {
        System.out.println("Professor: " + professorName);
    }
}

