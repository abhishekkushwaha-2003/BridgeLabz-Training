package com.JavaGenerics.MultiLevelUniversityCourseManagementSystem;

//Parent class for all course evaluation types
abstract class CourseType {

 private String courseName;

 // Constructor
 public CourseType(String courseName) {
     this.courseName = courseName;
 }

 // Getter
 public String getCourseName() {
     return courseName;
 }

 // Each course type will define its own evaluation
 public abstract String getEvaluationType();
}
