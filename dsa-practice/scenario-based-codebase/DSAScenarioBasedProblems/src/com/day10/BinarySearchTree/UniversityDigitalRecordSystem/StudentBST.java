package com.day10.BinarySearchTree.UniversityDigitalRecordSystem;

//Binary Search Tree for managing student records
public class StudentBST {

 private BSTNode root;

 // for insertion
 public void insert(Student student) {
     root = insertNode(root, student);
 }

 private BSTNode insertNode(BSTNode current, Student student) {

     if (current == null) {
         return new BSTNode(student);
     }

     if (student.rollNo < current.student.rollNo) {
         current.left = insertNode(current.left, student);
     } 
     else if (student.rollNo > current.student.rollNo) {
         current.right = insertNode(current.right, student);
     }

     return current;
 }

 // for searching
 public void search(int rollNo) {
     BSTNode result = searchNode(root, rollNo);

     if (result != null) {
         System.out.println("Student Found → Roll No: " 
                 + result.student.rollNo + 
                 ", Name: " + result.student.name);
     } else {
         System.out.println("Student record not found.");
     }
 }

 private BSTNode searchNode(BSTNode current, int rollNo) {

     if (current == null || current.student.rollNo == rollNo) {
         return current;
     }

     if (rollNo < current.student.rollNo) {
         return searchNode(current.left, rollNo);
     }

     return searchNode(current.right, rollNo);
 }

 // for deletion
 public void delete(int rollNo) {
     root = deleteNode(root, rollNo);
 }

 private BSTNode deleteNode(BSTNode current, int rollNo) {

     if (current == null) {
         return null;
     }

     if (rollNo < current.student.rollNo) {
         current.left = deleteNode(current.left, rollNo);
     } 
     else if (rollNo > current.student.rollNo) {
         current.right = deleteNode(current.right, rollNo);
     } 
     else {
         // No child
         if (current.left == null && current.right == null) {
             return null;
         }

         // One child
         if (current.left == null) {
             return current.right;
         }
         if (current.right == null) {
             return current.left;
         }

         // Two children
         BSTNode smallest = findMin(current.right);
         current.student = smallest.student;
         current.right = deleteNode(current.right, smallest.student.rollNo);
     }

     return current;
 }

 private BSTNode findMin(BSTNode node) {
     while (node.left != null) {
         node = node.left;
     }
     return node;
 }

 // for displaying
 public void displaySorted() {
     System.out.println("Sorted Student Records:");
     inorder(root);
 }

 private void inorder(BSTNode current) {
     if (current != null) {
         inorder(current.left);
         System.out.println("Roll No: " + current.student.rollNo
                 + ", Name: " + current.student.name);
         inorder(current.right);
     }
 }
}
