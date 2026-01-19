package com.JavaGenerics.MultiLevelUniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

class UniversityApp {

    public static void main(String[] args) {

        // Creating different course lists
        List<ExamCourse> examCourses = new ArrayList<>();
        examCourses.add(new ExamCourse("Mathematics"));
        examCourses.add(new ExamCourse("Physics"));

        List<AssignmentCourse> assignmentCourses = new ArrayList<>();
        assignmentCourses.add(new AssignmentCourse("English"));
        assignmentCourses.add(new AssignmentCourse("History"));

        List<ResearchCourse> researchCourses = new ArrayList<>();
        researchCourses.add(new ResearchCourse("AI Research"));
        researchCourses.add(new ResearchCourse("Data Science"));

        // Displaying courses using wildcard method
        System.out.println("---- Exam Courses ----");
        CourseUtil.displayCourses(examCourses);

        System.out.println("---- Assignment Courses ----");
        CourseUtil.displayCourses(assignmentCourses);

        System.out.println("---- Research Courses ----");
        CourseUtil.displayCourses(researchCourses);
    }
}

