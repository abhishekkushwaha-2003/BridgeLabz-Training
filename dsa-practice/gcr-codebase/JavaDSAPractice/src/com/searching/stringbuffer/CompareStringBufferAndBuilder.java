package com.searching.stringbuffer;

// create a class to compares performance of StringBuffer and StringBuilder for string concatenation
class CompareStringBufferAndBuilder {

    // Main method
    public static void main(String[] args) {

        // Number of times string will be appended
        int count = 1_000_000;

        // Creating StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Storing start time for StringBuffer
        long startTimeBuffer = System.nanoTime();

        // Appending string using StringBuffer
        for (int i = 0; i < count; i++) {
            stringBuffer.append("hello");
        }

        // Storing end time for StringBuffer
        long endTimeBuffer = System.nanoTime();

        // Calculating total time taken by StringBuffer
        long bufferTime = endTimeBuffer - startTimeBuffer;

        // Creating StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Storing start time for StringBuilder
        long startTimeBuilder = System.nanoTime();

        // Appending string using StringBuilder
        for (int i = 0; i < count; i++) {
            stringBuilder.append("hello");
        }

        // Storing end time for StringBuilder
        long endTimeBuilder = System.nanoTime();

        // Calculating total time taken by StringBuilder
        long builderTime = endTimeBuilder - startTimeBuilder;

        // Printing time taken by StringBuffer
        System.out.println("StringBuffer Time (ns): " + bufferTime);

        // Printing time taken by StringBuilder
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}
