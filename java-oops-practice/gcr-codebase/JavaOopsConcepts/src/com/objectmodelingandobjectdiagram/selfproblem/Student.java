package com.objectmodelingandobjectdiagram.selfproblem;
import java.util.ArrayList;

public class Student {

    // student name
    String studentName;

    // list of courses enrolled
    ArrayList<Course> courses = new ArrayList<>();

    // constructor
    Student(String studentName) {
        this.studentName = studentName;
    }

    // method to enroll in course
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // association both ways
    }

    // method to view enrolled courses
    void viewCourses() {
        System.out.println("Courses enrolled by " + studentName + ":");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}
