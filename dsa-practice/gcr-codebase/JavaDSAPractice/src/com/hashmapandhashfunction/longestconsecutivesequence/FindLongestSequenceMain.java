package com.hashmapandhashfunction.longestconsecutivesequence;

public class FindLongestSequenceMain {

	    public static void main(String[] args) {

	        int[] arr = {100, 4, 200, 1, 3, 2};

	        // create object
	        LongestSequenceFinder finder = new LongestSequenceFinder();

	        int result = finder.findLongest(arr);

	        System.out.println("Longest Consecutive Sequence Length: " + result);
	    }
	}

