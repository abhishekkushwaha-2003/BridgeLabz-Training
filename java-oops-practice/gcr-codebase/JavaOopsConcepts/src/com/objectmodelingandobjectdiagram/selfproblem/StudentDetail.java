package com.objectmodelingandobjectdiagram.selfproblem;

import java.util.ArrayList;

public class StudentDetail {

    // student name
    String studentName;

    // list of courses enrolled (association)
    ArrayList<CourseDetail> courses = new ArrayList<>();

    // constructor
    StudentDetail(String studentName) {
        this.studentName = studentName;
    }

    // method to enroll in course (communication)
    void enrollCourse(CourseDetail course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.courseName);
    }

    // method to view courses
    void viewCourses() {
        System.out.println("Courses of " + studentName + ":");
        for (CourseDetail c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}
