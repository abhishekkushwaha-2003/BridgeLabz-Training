package com.day10.BinarySearchTree.ECommerceProductInventory;

//Binary Search Tree for product inventory
public class ProductBST {

 private BSTNode root;

 // insertion
 public void insert(Product product) {
     root = insertNode(root, product);
 }

 private BSTNode insertNode(BSTNode current, Product product) {

     if (current == null) {
         return new BSTNode(product);
     }

     if (product.sku < current.product.sku) {
         current.left = insertNode(current.left, product);
     } 
     else if (product.sku > current.product.sku) {
         current.right = insertNode(current.right, product);
     }

     return current;
 }


 // Search product using SKU
 public Product search(int sku) {
     BSTNode node = searchNode(root, sku);
     return node != null ? node.product : null;
 }

 private BSTNode searchNode(BSTNode current, int sku) {

     if (current == null || current.product.sku == sku) {
         return current;
     }

     if (sku < current.product.sku) {
         return searchNode(current.left, sku);
     }

     return searchNode(current.right, sku);
 }

 // price update
 public void updatePrice(int sku, double newPrice) {

     Product product = search(sku);

     if (product != null) {
         product.price = newPrice;
         System.out.println("Price updated successfully.");
     } else {
         System.out.println("Product not found.");
     }
 }

 // Display products in sorted SKU order
 public void displaySorted() {
     System.out.println("Products sorted by SKU:");
     inorder(root);
 }

 private void inorder(BSTNode current) {
     if (current != null) {
         inorder(current.left);
         System.out.println("SKU: " + current.product.sku +
                 ", Name: " + current.product.name +
                 ", Price: ₹" + current.product.price);
         inorder(current.right);
     }
 }
}
