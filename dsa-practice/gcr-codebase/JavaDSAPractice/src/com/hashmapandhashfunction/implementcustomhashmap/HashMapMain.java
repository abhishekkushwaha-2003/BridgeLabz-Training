package com.hashmapandhashfunction.implementcustomhashmap;

public class HashMapMain {

	    public static void main(String[] args) {

	        CustomHashMap map = new CustomHashMap(5);

	        // insert values
	        map.put(1, "Apple");
	        map.put(6, "Banana"); // collision with key 1
	        map.put(11, "Mango");
	        map.put(2, "Orange");

	        // display map
	        map.display();

	        // get value
	        System.out.println("Value for key 6: " + map.get(6));

	        // remove key
	        map.remove(1);

	        System.out.println("\nAfter removing key 1:");
	        map.display();
	    }
	}

