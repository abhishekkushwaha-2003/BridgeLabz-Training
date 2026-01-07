package com.linkedlist.singlylinkedlist.studentrecordmanagement;

//singly linked list for student records
class StudentLinkedList {

 private StudentNode head; // head of the list

 // add at beginning
 void addAtBeginning(int rollNo, String name, int age, char grade) {
     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     newNode.next = head;
     head = newNode;
 }

 // add at end
 void addAtEnd(int rollNo, String name, int age, char grade) {
     StudentNode newNode = new StudentNode(rollNo, name, age, grade);

     if (head == null) {
         head = newNode;
         return;
     }

     StudentNode temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
 }

 // add at specific position (1-based index)
 void addAtPosition(int position, int rollNo, String name, int age, char grade) {
     if (position == 1) {
         addAtBeginning(rollNo, name, age, grade);
         return;
     }

     StudentNode newNode = new StudentNode(rollNo, name, age, grade);
     StudentNode temp = head;

     for (int i = 1; i < position - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Invalid position");
         return;
     }

     newNode.next = temp.next;
     temp.next = newNode;
 }

 // delete by roll number
 void deleteByRollNo(int rollNo) {
     if (head == null) {
         System.out.println("List is empty");
         return;
     }

     if (head.rollNo == rollNo) {
         head = head.next;
         return;
     }

     StudentNode temp = head;
     while (temp.next != null && temp.next.rollNo != rollNo) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Student not found");
     } else {
         temp.next = temp.next.next;
     }
 }

 // search by roll number
 void searchStudent(int rollNo) {
     StudentNode temp = head;

     while (temp != null) {
         if (temp.rollNo == rollNo) {
             System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // update grade
 void updateGrade(int rollNo, char newGrade) {
     StudentNode temp = head;

     while (temp != null) {
         if (temp.rollNo == rollNo) {
             temp.grade = newGrade;
             System.out.println("Grade updated");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // display all records
 void displayStudents() {
     if (head == null) {
         System.out.println("No student records");
         return;
     }

     StudentNode temp = head;
     while (temp != null) {
         System.out.println(
             "Roll: " + temp.rollNo +
             ", Name: " + temp.name +
             ", Age: " + temp.age +
             ", Grade: " + temp.grade
         );
         temp = temp.next;
     }
 }
}

