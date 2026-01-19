package com.collection.QueueInterface.ReverseAQueue;

import java.util.LinkedList;
import java.util.Queue;

class ReverseQueue {

    // Recursive method to reverse queue
    static void reverse(Queue<Integer> queue) {

        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();
        reverse(queue);
        queue.add(front);
    }

    // main method 
    public static void main(String[] args) {

    	// adding elements in queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // printing original queue
        System.out.println("Original Queue: " + queue);

        reverse(queue);

        // printing reverse queue
        System.out.println("Reversed Queue: " + queue);
    }
}

