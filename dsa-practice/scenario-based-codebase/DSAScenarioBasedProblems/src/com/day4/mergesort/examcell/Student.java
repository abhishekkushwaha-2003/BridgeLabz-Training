package com.day4.mergesort.examcell;

//Represents a student result
public class Student {

 int rollNo;
 String name;
 int score;

 public Student(int rollNo, String name, int score) {
     this.rollNo = rollNo;
     this.name = name;
     this.score = score;
 }

 public void display() {
     System.out.println(
         "Roll: " + rollNo +
         ", Name: " + name +
         ", Score: " + score
     );
 }
}
