package com.hashmapandhashfunction.implementcustomhashmap;

class HashNode {

    int key;
    String value;
    HashNode next;

    // constructor
    HashNode(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
