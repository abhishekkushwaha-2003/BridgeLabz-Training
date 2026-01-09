package com.algorithmruntimeanalysisandbigonotation.recursivevsiterativefibonaccicomputation;

//This class compares Recursive and Iterative Fibonacci performance
class FibonacciComparison {

 // Main method
 public static void main(String[] args) {

     // Defining Fibonacci number to calculate
     int n = 15;

     // ---------------- Recursive Fibonacci ----------------

     // Storing start time for recursive approach
     long recursiveStart = System.nanoTime();

     // Calling recursive Fibonacci method
     int recursiveResult = FibonacciRecursive.fibonacciRecursive(n);

     // Storing end time for recursive approach
     long recursiveEnd = System.nanoTime();

     // Calculating recursive execution time
     long recursiveTime = recursiveEnd - recursiveStart;

     // ---------------- Iterative Fibonacci ----------------

     // Storing start time for iterative approach
     long iterativeStart = System.nanoTime();

     // Calling iterative Fibonacci method
     int iterativeResult = FibonacciIterative.fibonacciIterative(n);

     // Storing end time for iterative approach
     long iterativeEnd = System.nanoTime();

     // Calculating iterative execution time
     long iterativeTime = iterativeEnd - iterativeStart;

     // Printing results
     System.out.println("Fibonacci Number (n = " + n + ")");
     System.out.println("Recursive Result : " + recursiveResult);
     System.out.println("Iterative Result : " + iterativeResult);
     System.out.println("Recursive Time (ns): " + recursiveTime);
     System.out.println("Iterative Time (ns): " + iterativeTime);
 }
}

