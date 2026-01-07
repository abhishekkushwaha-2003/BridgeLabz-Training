package com.linkedlist.singlylinkedlist.studentrecordmanagement;

//node class for singly linked list
class StudentNode {

 int rollNo;
 String name;
 int age;
 char grade;

 StudentNode next; // pointer to next node

 // constructor
 StudentNode(int rollNo, String name, int age, char grade) {
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.grade = grade;
     this.next = null;
 }
}
