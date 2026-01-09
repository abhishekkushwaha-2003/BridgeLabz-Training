package com.algorithmruntimeanalysisandbigonotation.recursivevsiterativefibonaccicomputation;

//This class calculates Fibonacci using iterative approach
class FibonacciIterative {

 // This method calculates Fibonacci number using iteration
 static int fibonacciIterative(int n) {

     // Handling base cases
     if (n <= 1) {
         return n;
     }

     // Initializing first two Fibonacci numbers
     int a = 0;
     int b = 1;
     int sum = 0;

     // Looping to calculate Fibonacci iteratively
     for (int i = 2; i <= n; i++) {

         // Calculating next Fibonacci number
         sum = a + b;

         // Updating values
         a = b;
         b = sum;
     }

     // Returning final Fibonacci value
     return b;
 }
}

