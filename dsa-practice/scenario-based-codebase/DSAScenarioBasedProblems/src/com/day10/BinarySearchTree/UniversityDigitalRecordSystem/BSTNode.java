package com.day10.BinarySearchTree.UniversityDigitalRecordSystem;

//Node of Binary Search Tree
public class BSTNode {

 Student student;
 BSTNode left;
 BSTNode right;

 // constructor
 public BSTNode(Student student) {
     this.student = student;
     this.left = null;
     this.right = null;
 }
}
