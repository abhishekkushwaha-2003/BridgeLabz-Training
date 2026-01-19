package com.day7.MergeSort.EduResults;

//create a class Student to Represents a student's exam result
public class Student {

 int rollNo;     // Unique roll number
 String name;    // Student name
 int score;      // Exam score

 // Constructor
 public Student(int rollNo, String name, int score) {
     this.rollNo = rollNo;
     this.name = name;
     this.score = score;
 }

 // Display student details
 public void display() {
     System.out.println("Roll: " + rollNo + ", Name: " + name + ", Score: " + score);
 }
}
