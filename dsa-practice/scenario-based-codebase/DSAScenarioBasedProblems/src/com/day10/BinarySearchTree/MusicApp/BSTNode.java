package com.day10.BinarySearchTree.MusicApp;

//Node of Binary Search Tree
public class BSTNode {

 Song song;
 BSTNode left;
 BSTNode right;

 // constructor
 public BSTNode(Song song) {
     this.song = song;
     this.left = null;
     this.right = null;
 }
}

