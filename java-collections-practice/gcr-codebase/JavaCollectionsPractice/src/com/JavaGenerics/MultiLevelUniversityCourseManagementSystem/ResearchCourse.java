package com.JavaGenerics.MultiLevelUniversityCourseManagementSystem;

//Research based course
class ResearchCourse extends CourseType {

 public ResearchCourse(String courseName) {
     super(courseName);
 }

 @Override
 public String getEvaluationType() {
     return "Research Based";
 }
}

