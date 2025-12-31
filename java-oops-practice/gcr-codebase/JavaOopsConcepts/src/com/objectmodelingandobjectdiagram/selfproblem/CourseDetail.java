package com.objectmodelingandobjectdiagram.selfproblem;

import java.util.ArrayList;

public class CourseDetail {

	    // course name
	    String courseName;

	    // professor assigned to course
	    Professor professor;

	    // list of students
	    ArrayList<StudentDetail> students = new ArrayList<>();

	    // constructor
	    CourseDetail(String courseName) {
	        this.courseName = courseName;
	    }

	    // assign professor to course (communication)
	    void assignProfessor(Professor professor) {
	        this.professor = professor;
	        System.out.println(professor.professorName +
	                           " assigned to " + courseName);
	    }

	    // add student to course
	    void addStudent(StudentDetail student) {
	        students.add(student);
	    }

	    // show course details
	    void showCourse() {
	        System.out.println("Course: " + courseName);
	        if (professor != null) {
	            System.out.println("Taught by: " + professor.professorName);
	        }
	        System.out.println("Students Enrolled:");
	        for (StudentDetail s : students) {
	            System.out.println("- " + s.studentName);
	        }
	    }
	}

