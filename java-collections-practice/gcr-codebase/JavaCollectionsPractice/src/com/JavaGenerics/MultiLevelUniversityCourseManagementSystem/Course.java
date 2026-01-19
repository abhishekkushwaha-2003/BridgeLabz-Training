package com.JavaGenerics.MultiLevelUniversityCourseManagementSystem;

//T must be CourseType or its child
class Course<T extends CourseType> {

 private T courseType;

 // Constructor
 public Course(T courseType) {
     this.courseType = courseType;
 }

 // Getter
 public T getCourseType() {
     return courseType;
 }
}
