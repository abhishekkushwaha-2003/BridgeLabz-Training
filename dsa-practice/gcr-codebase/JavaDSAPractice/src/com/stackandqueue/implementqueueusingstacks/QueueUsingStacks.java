package com.stackandqueue.implementqueueusingstacks;

import java.util.Stack;

//queue class using two stacks
class QueueUsingStacks {

 // stack for inserting elements
 Stack<Integer> stack1 = new Stack<>();

 // stack for removing elements
 Stack<Integer> stack2 = new Stack<>();

 // enqueue operation
 void enqueue(int data) {
     stack1.push(data);
     System.out.println(data + " inserted into queue");
 }

 // dequeue operation
 int dequeue() {

     // if both stacks are empty
     if (stack1.isEmpty() && stack2.isEmpty()) {
         System.out.println("Queue is empty");
         return -1;
     }

     // move elements only if stack2 is empty
     if (stack2.isEmpty()) {
         while (!stack1.isEmpty()) {
             stack2.push(stack1.pop());
         }
     }

     return stack2.pop();
 }
}
