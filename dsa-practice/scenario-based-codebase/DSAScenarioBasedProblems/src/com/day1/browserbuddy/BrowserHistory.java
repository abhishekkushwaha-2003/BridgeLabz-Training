package com.day1.browserbuddy;

import java.util.Stack;

//Browser history manager using Doubly Linked List + Stack
public class BrowserHistory {

 // Current page pointer
 private PageNode current;

 // Stack to store closed tabs
 private Stack<String> closedTabs;

 // Constructor
 public BrowserHistory() {
     current = null;
     closedTabs = new Stack<>();
 }

 // Visit a new page
 public void visitPage(String url) {

     PageNode newPage = new PageNode(url);

     // If no page exists yet
     if (current == null) {
         current = newPage;
         return;
     }

     // Clear forward history
     current.next = null;

     // Link new page
     newPage.prev = current;
     current.next = newPage;
     current = newPage;

     System.out.println("Visited: " + url);
 }

 // Go back in history
 public void goBack() {
     if (current != null && current.prev != null) {
         current = current.prev;
         System.out.println("Back to: " + current.url);
     } else {
         System.out.println("No previous page");
     }
 }

 // Go forward in history
 public void goForward() {
     if (current != null && current.next != null) {
         current = current.next;
         System.out.println("Forward to: " + current.url);
     } else {
         System.out.println("No next page");
     }
 }

 // Close current tab
 public void closeTab() {
     if (current == null) {
         System.out.println("No tab to close");
         return;
     }

     // Push closed tab to stack
     closedTabs.push(current.url);
     System.out.println("Tab closed: " + current.url);

     // Move to previous page if exists
     if (current.prev != null) {
         current = current.prev;
         current.next = null;
     } else {
         current = null;
     }
 }

 // Reopen last closed tab
 public void reopenTab() {
     if (closedTabs.isEmpty()) {
         System.out.println("No closed tabs to reopen");
         return;
     }

     String url = closedTabs.pop();
     visitPage(url);
     System.out.println("Reopened tab: " + url);
 }
}

