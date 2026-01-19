package com.collection.QueueInterface.ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element into stack
    void push(int x) {

        // Add new element to empty queue
        q2.add(x);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Remove top element
    int pop() {
        return q1.remove();
    }

    // Get top element
    int top() {
        return q1.peek();
    }

    // main method 
    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();

        // adding elements in stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());
    }
}
