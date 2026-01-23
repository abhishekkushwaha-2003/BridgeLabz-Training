package com.day10.BinarySearchTree.UniversityDigitalRecordSystem;

public class UniversityApp {

    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

        // Insertion
        bst.insert(new Student(105, "Rahul"));
        bst.insert(new Student(101, "Rajeev"));
        bst.insert(new Student(110, "Sonu"));
        bst.insert(new Student(103, "Abhishek"));

        //  Search
        bst.search(103);

        // Display sorted list
        bst.displaySorted();

        // Deletion
        bst.delete(101);

        System.out.println("\nAfter deleting roll number 101:");
        bst.displaySorted();
    }
}
