package com.day1.browserbuddy;

//Node class for Doubly Linked List
public class PageNode {

 String url;          
 PageNode prev;       
 PageNode next;     

 PageNode(String url) {
     this.url = url;
     this.prev = null;
     this.next = null;
 }
}
