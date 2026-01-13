package com.day2.traincompanion;

//Doubly Linked List managing train compartments
public class TrainCompanion {

 private Compartment head;     // First compartment
 private Compartment current;  // Passenger current position

 // Add compartment at the end
 public void addCompartment(String name, String service) {

     Compartment newComp = new Compartment(name, service);

     // If list is empty
     if (head == null) {
         head = newComp;
         current = head;
         return;
     }

     // Traverse to last compartment
     Compartment temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }

     // Link new compartment
     temp.next = newComp;
     newComp.prev = temp;
 }

 // Move to next compartment
 public void moveNext() {

     if (current != null && current.next != null) {
         current = current.next;
         System.out.println("Moved to: " + current.name);
     } else {
         System.out.println("You are in the last compartment");
     }
 }

 // Move to previous compartment
 public void movePrevious() {

     if (current != null && current.prev != null) {
         current = current.prev;
         System.out.println("Moved to: " + current.name);
     } else {
         System.out.println("You are in the first compartment");
     }
 }

 // Show adjacent compartments
 public void showAdjacent() {

     System.out.println("\nCurrent Compartment: " + current.name);

     if (current.prev != null)
         System.out.println("Previous: " + current.prev.name);
     else
         System.out.println("Previous: None");

     if (current.next != null)
         System.out.println("Next: " + current.next.name);
     else
         System.out.println("Next: None");
 }

 // Search for a service (like Pantry/WiFi)
 public void searchService(String service) {

     Compartment temp = head;

     while (temp != null) {
         if (temp.service.equalsIgnoreCase(service)) {
             System.out.println(
                 service + " available in compartment: " + temp.name
             );
             return;
         }
         temp = temp.next;
     }

     System.out.println(service + " service not found");
 }

 // Remove a compartment dynamically
 public void removeCompartment(String name) {

     Compartment temp = head;

     while (temp != null) {

         if (temp.name.equals(name)) {

             // If removing head
             if (temp.prev == null) {
                 head = temp.next;
                 if (head != null)
                     head.prev = null;
             }
             // If removing middle or last
             else {
                 temp.prev.next = temp.next;
                 if (temp.next != null)
                     temp.next.prev = temp.prev;
             }

             // Update current if needed
             if (current == temp) {
                 current = (temp.next != null) ? temp.next : temp.prev;
             }

             System.out.println("Compartment removed: " + name);
             return;
         }
         temp = temp.next;
     }

     System.out.println("Compartment not found: " + name);
 }
}

