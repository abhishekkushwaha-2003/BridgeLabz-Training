package com.hashmapandhashfunction.implementcustomhashmap;

class CustomHashMap {

    private HashNode[] buckets;
    private int size;

    // constructor
    CustomHashMap(int capacity) {
        buckets = new HashNode[capacity];
        size = 0;
    }

    // hash function
    private int getIndex(int key) {
        return key % buckets.length;
    }

    // insert or update value
    void put(int key, String value) {

        int index = getIndex(key);
        HashNode head = buckets[index];

        // check if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value; // update
                return;
            }
            head = head.next;
        }

        // insert new node at beginning
        HashNode newNode = new HashNode(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    // get value by key
    String get(int key) {

        int index = getIndex(key);
        HashNode head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return null; // key not found
    }

    // remove key-value pair
    void remove(int key) {

        int index = getIndex(key);
        HashNode head = buckets[index];
        HashNode prev = null;

        while (head != null) {

            if (head.key == key) {

                if (prev != null) {
                    prev.next = head.next;
                } else {
                    buckets[index] = head.next;
                }

                size--;
                return;
            }

            prev = head;
            head = head.next;
        }
    }

    // display map
    void display() {

        for (int i = 0; i < buckets.length; i++) {

            HashNode head = buckets[i];

            System.out.print("Bucket " + i + ": ");

            while (head != null) {
                System.out.print("[" + head.key + " = " + head.value + "] ");
                head = head.next;
            }

            System.out.println();
        }
    }
}
