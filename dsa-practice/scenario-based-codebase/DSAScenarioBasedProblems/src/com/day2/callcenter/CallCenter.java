package com.day2.callcenter;

import java.util.*;

//CallCenter manages customer calls using Queue + PriorityQueue + HashMap
public class CallCenter {

 // Queue for normal customers (FIFO)
 private Queue<String> normalQueue;

 // Priority queue for VIP customers
 private PriorityQueue<String> vipQueue;

 // HashMap to track number of calls per customer
 private HashMap<String, Integer> callCount;

 // Constructor to initialize data structures
 public CallCenter() {
     normalQueue = new LinkedList<>();
     vipQueue = new PriorityQueue<>();
     callCount = new HashMap<>();
 }

 // Add incoming call
 public void addCall(String customerName, boolean isVIP) {

     // Update call count
     callCount.put(customerName,
             callCount.getOrDefault(customerName, 0) + 1);

     // Add customer to appropriate queue
     if (isVIP) {
         vipQueue.offer(customerName);
         System.out.println("VIP Call added: " + customerName);
     } else {
         normalQueue.offer(customerName);
         System.out.println("Normal Call added: " + customerName);
     }
 }

 // Serve next call
 public void serveCall() {

     // VIP customers are served first
     if (!vipQueue.isEmpty()) {
         String customer = vipQueue.poll();
         System.out.println("Serving VIP customer: " + customer);
     }
     // If no VIPs, serve normal customer
     else if (!normalQueue.isEmpty()) {
         String customer = normalQueue.poll();
         System.out.println("Serving normal customer: " + customer);
     }
     else {
         System.out.println("No calls in queue");
     }
 }

 // Display current status
 public void displayStatus() {

     System.out.println("\n Call Center Status");
     System.out.println("VIP Queue: " + vipQueue);
     System.out.println("Normal Queue: " + normalQueue);
     System.out.println("Call Count Map: " + callCount);
 }
}
