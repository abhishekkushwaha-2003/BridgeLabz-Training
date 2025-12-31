package com.objectmodelingandobjectdiagram.selfproblem;
import java.util.ArrayList;

public class Course {

    // course name
    String courseName;

    // list of students enrolled
    ArrayList<Student> students = new ArrayList<>();

    // constructor
    Course(String courseName) {
        this.courseName = courseName;
    }

    // method to add student to course
    void addStudent(Student student) {
        students.add(student);
    }

    // method to show enrolled students
    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.studentName);
        }
    }
}
