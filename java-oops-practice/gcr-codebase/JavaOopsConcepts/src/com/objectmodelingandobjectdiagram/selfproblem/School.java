package com.objectmodelingandobjectdiagram.selfproblem;
import java.util.ArrayList;

public class School {

    // school name
    String schoolName;

    // list of students (aggregation)
    ArrayList<Student> students = new ArrayList<>();

    // constructor
    School(String schoolName) {
        this.schoolName = schoolName;
    }

    // method to add student to school
    void addStudent(Student student) {
        students.add(student);
    }

    // method to show school students
    void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.studentName);
        }
    }
}
