package com.day11.AVLTree.OnlineTicketBookingByTime;

// create a class to handles BST operations for events

public class EventBST {

 private EventNode root;

 // insert new event based on start time
 private EventNode insert(EventNode node, int eventId, int startTime) {

     // if tree is empty
     if (node == null)
         return new EventNode(eventId, startTime);

     // earlier event goes to left
     if (startTime < node.startTime)
         node.left = insert(node.left, eventId, startTime);

     // later event goes to right
     else if (startTime > node.startTime)
         node.right = insert(node.right, eventId, startTime);

     return node;
 }

 // public method to add event
 public void addEvent(int eventId, int startTime) {
     root = insert(root, eventId, startTime);
 }

 // find minimum value node 
 private EventNode minValueNode(EventNode node) {
     EventNode current = node;
     while (current.left != null)
         current = current.left;
     return current;
 }

 // delete event using start time
 private EventNode delete(EventNode node, int startTime) {

     if (node == null)
         return node;

     if (startTime < node.startTime)
         node.left = delete(node.left, startTime);

     else if (startTime > node.startTime)
         node.right = delete(node.right, startTime);

     else {
         // if one child or no child
         if (node.left == null)
             return node.right;
         else if (node.right == null)
             return node.left;

         // if two children
         EventNode temp = minValueNode(node.right);
         node.startTime = temp.startTime;
         node.eventId = temp.eventId;

         node.right = delete(node.right, temp.startTime);
     }

     return node;
 }

 // method to cancel event
 public void cancelEvent(int startTime) {
     root = delete(root, startTime);
 }

 // method for inorder traversal 
 private void inorder(EventNode node) {
     if (node == null)
         return;

     inorder(node.left);
     System.out.println("Event ID: " + node.eventId +
                        " | Start Time: " + node.startTime);
     inorder(node.right);
 }

 // method for display 
 public void showEventsInOrder() {
     inorder(root);
 }
}
