package com.AnnotationsAndReflection.ReflectionProblem.BasicLevel.DynamicallyCreateObjects;

public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}
