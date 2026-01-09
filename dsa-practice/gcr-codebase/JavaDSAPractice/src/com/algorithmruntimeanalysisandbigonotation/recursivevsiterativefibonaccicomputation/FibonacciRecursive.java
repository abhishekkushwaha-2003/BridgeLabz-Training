package com.algorithmruntimeanalysisandbigonotation.recursivevsiterativefibonaccicomputation;

//This class calculates Fibonacci using recursive approach
class FibonacciRecursive {

 // This method calculates Fibonacci number using recursion
 static int fibonacciRecursive(int n) {

     // Base condition
     if (n <= 1) {
         return n;
     }

     // Recursive call for Fibonacci
     return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
 }
}
