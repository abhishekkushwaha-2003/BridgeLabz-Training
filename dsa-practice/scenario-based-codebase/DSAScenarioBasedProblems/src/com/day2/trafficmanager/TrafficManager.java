
package com.day2.trafficmanager;
import java.util.LinkedList;
import java.util.Queue;

//Traffic Manager using Circular Linked List + Queue
class TrafficManager {

 private Vehicle head;
 private Queue<String> waitingQueue;
 private int maxQueueSize;

 public TrafficManager(int maxQueueSize) {
     this.head = null;
     this.waitingQueue = new LinkedList<>();
     this.maxQueueSize = maxQueueSize;
 }

 // Vehicle requests to enter roundabout
 public void requestEntry(String plate) {
     if (waitingQueue.size() >= maxQueueSize) {
         System.out.println("Queue Overflow: " + plate + " cannot enter");
         return;
     }
     waitingQueue.offer(plate);
     System.out.println("Vehicle queued: " + plate);
 }

 // Allow next queued vehicle to enter roundabout
 public void allowEntry() {
     if (waitingQueue.isEmpty()) {
         System.out.println("Queue Underflow: No vehicles waiting");
         return;
     }
     addToRoundabout(waitingQueue.poll());
 }

 // Add vehicle to circular linked list
 private void addToRoundabout(String plate) {
     Vehicle newVehicle = new Vehicle(plate);

     if (head == null) {
         head = newVehicle;
         newVehicle.next = head;
     } else {
         Vehicle temp = head;
         while (temp.next != head) {
             temp = temp.next;
         }
         temp.next = newVehicle;
         newVehicle.next = head;
     }
     System.out.println("Vehicle entered roundabout: " + plate);
 }

 // Remove a vehicle from roundabout
 public void exitRoundabout(String plate) {
     if (head == null) return;

     Vehicle curr = head;
     Vehicle prev = null;

     do {
         if (curr.plate.equals(plate)) {
             if (curr == head && curr.next == head) {
                 head = null;
             } else if (curr == head) {
                 prev = head;
                 while (prev.next != head) prev = prev.next;
                 head = curr.next;
                 prev.next = head;
             } else {
                 prev.next = curr.next;
             }
             System.out.println("Vehicle exited: " + plate);
             return;
         }
         prev = curr;
         curr = curr.next;
     } while (curr != head);
 }

 // Print current roundabout state
 public void printRoundabout() {
     if (head == null) {
         System.out.println("Roundabout empty");
         return;
     }

     Vehicle temp = head;
     System.out.print("Roundabout: ");
     do {
         System.out.print(temp.plate + " -> ");
         temp = temp.next;
     } while (temp != head);
     System.out.println("(back to " + head.plate + ")");
 }
}