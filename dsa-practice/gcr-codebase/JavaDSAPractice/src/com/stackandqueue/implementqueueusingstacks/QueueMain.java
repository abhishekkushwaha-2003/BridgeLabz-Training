package com.stackandqueue.implementqueueusingstacks;

public class QueueMain {
    public static void main(String[] args) {

        // create queue object
        QueueUsingStacks q = new QueueUsingStacks();

        // adding elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // removing elements
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
    }
}

