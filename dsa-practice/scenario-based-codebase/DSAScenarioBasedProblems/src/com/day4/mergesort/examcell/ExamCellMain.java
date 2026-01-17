package com.day4.mergesort.examcell;

//Main class (Entry point)
public class ExamCellMain {

 public static void main(String[] args) {

     Student[] students = {
         new Student(101, "Abhi", 85),
         new Student(102, "Rahul", 92),
         new Student(103, "Kunal", 78),
         new Student(104, "Sonu", 95),
         new Student(105, "Rajeev", 88)
     };

     System.out.println("Before Ranking:");
     ExamCell.displayStudents(students);

     ExamCell.mergeSort(students, 0, students.length - 1);

     System.out.println("\nState-Level Rank List:");
     ExamCell.displayStudents(students);
 }
}

