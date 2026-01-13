package com.day3.parceltracker;

//Singly Linked List for parcel tracking
public class ParcelTracker {

 private StageNode head;

 // Initialize default delivery stages
 public ParcelTracker() {
     addStage("Packed");
     addStage("Shipped");
     addStage("In Transit");
     addStage("Delivered");
 }

 // Add stage at end
 public void addStage(String stage) {
     StageNode newNode = new StageNode(stage);

     if (head == null) {
         head = newNode;
         return;
     }

     StageNode temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
 }

 // Add intermediate checkpoint after a given stage
 public void addCheckpointAfter(String afterStage, String newStage) {
     StageNode temp = head;

     while (temp != null) {
         if (temp.stage.equals(afterStage)) {
             StageNode node = new StageNode(newStage);
             node.next = temp.next;
             temp.next = node;
             return;
         }
         temp = temp.next;
     }
 }

 // Track parcel forward
 public void trackParcel() {
     if (head == null) {
         System.out.println("Parcel lost: no tracking data");
         return;
     }

     StageNode temp = head;
     System.out.print("Parcel Route: ");

     while (temp != null) {
         System.out.print(temp.stage + " -> ");
         temp = temp.next;
     }
     System.out.println("END");
 }

 // Simulate lost parcel
 public void markLostAfter(String stage) {
     StageNode temp = head;

     while (temp != null) {
         if (temp.stage.equals(stage)) {
             temp.next = null;
             return;
         }
         temp = temp.next;
     }
 }
}
