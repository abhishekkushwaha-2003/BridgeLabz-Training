package com.day11.AVLTree.HospitalQueueManagement;

//create a  class to  manages patient records using AVL Tree
public class HospitalAVL {

 private PatientNode root;

 // get height of node
 private int height(PatientNode node) {
     if (node == null)
         return 0;
     return node.height;
 }

 // get balance factor
 private int getBalance(PatientNode node) {
     if (node == null)
         return 0;
     return height(node.left) - height(node.right);
 }

 // right rotation
 private PatientNode rightRotate(PatientNode y) {
     PatientNode x = y.left;
     PatientNode t2 = x.right;

     x.right = y;
     y.left = t2;

     y.height = Math.max(height(y.left), height(y.right)) + 1;
     x.height = Math.max(height(x.left), height(x.right)) + 1;

     return x;
 }

 // left rotation
 private PatientNode leftRotate(PatientNode x) {
     PatientNode y = x.right;
     PatientNode t2 = y.left;

     y.left = x;
     x.right = t2;

     x.height = Math.max(height(x.left), height(x.right)) + 1;
     y.height = Math.max(height(y.left), height(y.right)) + 1;

     return y;
 }

 // insert new patient
 private PatientNode insert(PatientNode node, int patientId, int checkInTime) {

     // normal BST insertion
     if (node == null)
         return new PatientNode(patientId, checkInTime);

     if (checkInTime < node.checkInTime)
         node.left = insert(node.left, patientId, checkInTime);
     else if (checkInTime > node.checkInTime)
         node.right = insert(node.right, patientId, checkInTime);
     else
         return node; 

     // update height
     node.height = 1 + Math.max(height(node.left), height(node.right));

     // check balance
     int balance = getBalance(node);

     // LL case
     if (balance > 1 && checkInTime < node.left.checkInTime)
         return rightRotate(node);

     // RR case
     if (balance < -1 && checkInTime > node.right.checkInTime)
         return leftRotate(node);

     // LR case
     if (balance > 1 && checkInTime > node.left.checkInTime) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     // RL case
     if (balance < -1 && checkInTime < node.right.checkInTime) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 //  method for patient registration
 public void registerPatient(int patientId, int checkInTime) {
     root = insert(root, patientId, checkInTime);
 }

 // find minimum value node
 private PatientNode minValueNode(PatientNode node) {
     PatientNode current = node;
     while (current.left != null)
         current = current.left;
     return current;
 }

 // delete patient record
 private PatientNode delete(PatientNode node, int checkInTime) {

     if (node == null)
         return node;

     if (checkInTime < node.checkInTime)
         node.left = delete(node.left, checkInTime);
     else if (checkInTime > node.checkInTime)
         node.right = delete(node.right, checkInTime);
     else {
         // node with one or no child
         if (node.left == null || node.right == null) {
             node = (node.left != null) ? node.left : node.right;
         } else {
             // node with two children
             PatientNode temp = minValueNode(node.right);
             node.checkInTime = temp.checkInTime;
             node.patientId = temp.patientId;
             node.right = delete(node.right, temp.checkInTime);
         }
     }

     if (node == null)
         return node;

     // update height
     node.height = Math.max(height(node.left), height(node.right)) + 1;

     // rebalance
     int balance = getBalance(node);

     if (balance > 1 && getBalance(node.left) >= 0)
         return rightRotate(node);

     if (balance > 1 && getBalance(node.left) < 0) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     if (balance < -1 && getBalance(node.right) <= 0)
         return leftRotate(node);

     if (balance < -1 && getBalance(node.right) > 0) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 // method to discharge patient
 public void dischargePatient(int checkInTime) {
     root = delete(root, checkInTime);
 }

 // inorder traversal to display patients by arrival time
 private void inorder(PatientNode node) {
     if (node == null)
         return;

     inorder(node.left);
     System.out.println("Patient ID: " + node.patientId +
                        " | Check-in Time: " + node.checkInTime);
     inorder(node.right);
 }

 // display all patients in arrival order
 public void displayPatients() {
     inorder(root);
 }
}
