package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordApp {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        // adding students
        list.addAtBeginning(1, "Rajeev", 20, 'A');
        list.addAtEnd(2, "Abhishek", 21, 'B');
        list.addAtEnd(3, "Vishal", 22, 'C');

        // display list
        list.displayStudents();

        System.out.println("----------------");

        // search student
        list.searchStudent(2);

        // update grade
        list.updateGrade(3, 'A');

        // delete student
        list.deleteByRollNo(1);

        System.out.println("----------------");

        // final list
        list.displayStudents();
    }
}
