package com.day7.MergeSort.EduResults;

//Main class
public class EduResultsApp {

 public static void main(String[] args) {

     // Combined sorted lists from different districts
     Student[] students = {
         new Student(101, "Aman", 92),
         new Student(102, "Riya", 88),
         new Student(103, "Kunal", 95),
         new Student(104, "Sneha", 88),
         new Student(105, "Rahul", 76)
     };

     // displaying result before sorting
     System.out.println("Before State-Level Ranking:");
     EduResults.displayStudents(students);

     // Merge Sort to generate rank list
     EduResults.mergeSort(students, 0, students.length - 1);

     // displaying the final result after sorting
     System.out.println("\nFinal State-Level Rank Sheet After Sorting : ");
     EduResults.displayStudents(students);
 }
}

