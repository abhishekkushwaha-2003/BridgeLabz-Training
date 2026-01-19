package com.JavaGenerics.MultiLevelUniversityCourseManagementSystem;

//Assignment based course
class AssignmentCourse extends CourseType {

 public AssignmentCourse(String courseName) {
     super(courseName);
 }

 @Override
 public String getEvaluationType() {
     return "Assignment Based";
 }
}
