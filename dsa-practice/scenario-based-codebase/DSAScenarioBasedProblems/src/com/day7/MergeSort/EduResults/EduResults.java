package com.day7.MergeSort.EduResults;

//Contains Merge Sort logic for rank generation
public class EduResults {

 // Merge Sort method
 public static void mergeSort(Student[] students, int left, int right) {

     // Base condition
     if (left < right) {

         int mid = (left + right) / 2;

         // Sort left half
         mergeSort(students, left, mid);

         // Sort right half
         mergeSort(students, mid + 1, right);

         // Merge both halves
         merge(students, left, mid, right);
     }
 }

 // Merge two sorted sublists (stable)
 private static void merge(Student[] students, int left, int mid, int right) {

     int n1 = mid - left + 1;
     int n2 = right - mid;

     Student[] L = new Student[n1];
     Student[] R = new Student[n2];

     // Copy data to temporary arrays
     for (int i = 0; i < n1; i++)
         L[i] = students[left + i];

     for (int j = 0; j < n2; j++)
         R[j] = students[mid + 1 + j];

     int i = 0, j = 0, k = left;

     // Merge while comparing scores (descending order)
     while (i < n1 && j < n2) {

         // >= keeps sorting STABLE for equal scores
         if (L[i].score >= R[j].score) {
             students[k++] = L[i++];
         } else {
             students[k++] = R[j++];
         }
     }

     // Copy remaining students
     while (i < n1)
         students[k++] = L[i++];

     while (j < n2)
         students[k++] = R[j++];
 }

 // Display rank list
 public static void displayStudents(Student[] students) {
     for (Student s : students) {
         s.display();
     }
 }
}
