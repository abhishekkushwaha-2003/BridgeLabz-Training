package com.collection.QueueInterface.CircularBufferSimulation;

class CircularBuffer {

    int[] buffer;
    int size;
    int front = 0;
    int count = 0;

    // Constructor
    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Add element to buffer
    void add(int value) {

        // Calculate position using circular logic
        buffer[(front + count) % size] = value;

        if (count < size) {
            count++;
        } else {
            // Buffer full, overwrite oldest element
            front = (front + 1) % size;
        }
    }

    // Display buffer elements
    void display() {

        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    // main method 
    public static void main(String[] args) {

        CircularBuffer buffer = new CircularBuffer(3);

        // sdding elements 
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.display();

        buffer.add(4);
        buffer.display();
    }
}
