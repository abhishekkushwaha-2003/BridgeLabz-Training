package com.day1.ambulanceroute;

//Circular Linked List to manage ambulance routing
public class AmbulanceRoute {

 // Pointer to first hospital unit
 private Hospital head;

 // Constructor
 public AmbulanceRoute() {
     head = null;
 }

 // Add a hospital unit to circular route
 public void addUnit(String name, boolean isAvailable) {

	 Hospital newUnit = new Hospital(name, isAvailable);

     // If first unit
     if (head == null) {
         head = newUnit;
         newUnit.next = head; // circular link
         return;
     }

     // Traverse to last unit
     Hospital temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     // Insert new unit at end
     temp.next = newUnit;
     newUnit.next = head;
 }

 // Find nearest available unit by circular rotation
 public void findAvailableUnit() {

     if (head == null) {
         System.out.println("No hospital units available");
         return;
     }

     Hospital temp = head;

     do {
         if (temp.isAvailable) {
             System.out.println("Patient directed to: " + temp.name);
             return;
         }
         temp = temp.next;
     } while (temp != head);

     System.out.println("No unit currently available");
 }

 // Remove a unit if under maintenance
 public void removeUnit(String unitName) {

     if (head == null) return;

     Hospital curr = head;
     Hospital prev = null;

     do {
         if (curr.name.equals(unitName)) {

             // Case 1: Single node
             if (curr == head && curr.next == head) {
                 head = null;
             }
             // Case 2: Removing head
             else if (curr == head) {
                 prev = head;
                 while (prev.next != head) {
                     prev = prev.next;
                 }
                 head = curr.next;
                 prev.next = head;
             }
             // Case 3: Middle or last node
             else {
                 prev.next = curr.next;
             }

             System.out.println("Unit removed (maintenance): " + unitName);
             return;
         }

         prev = curr;
         curr = curr.next;

     } while (curr != head);
 }

 // Display circular route
 public void displayRoute() {

     if (head == null) {
         System.out.println("No hospital units");
         return;
     }

     Hospital temp = head;
     System.out.print("Hospital Route: ");

     do {
         System.out.print(temp.name + " → ");
         temp = temp.next;
     } while (temp != head);

     System.out.println("(Back to " + head.name + ")");
 }
}
