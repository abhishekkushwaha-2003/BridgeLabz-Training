package com.day10.BinarySearchTree.ECommerceProductInventory;

//Node of BST which holds one product
public class BSTNode {

 Product product;
 BSTNode left;
 BSTNode right;

 //constructor
 public BSTNode(Product product) {
     this.product = product;
     this.left = null;
     this.right = null;
 }
}
