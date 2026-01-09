package com.algorithmruntimeanalysisandbigonotation.comparedatastructureforsearching;

import java.util.*;

//This class compares search performance of Array, HashSet and TreeSet
class ComparisonAll {

 // Main method
 public static void main(String[] args) {

     // Defining dataset size
     int size = 1_000_000;

     // Creating array
     int[] arr = new int[size];

     // Creating HashSet
     HashSet<Integer> hashSet = new HashSet<>();

     // Creating TreeSet
     TreeSet<Integer> treeSet = new TreeSet<>();

     // Filling all data structures
     for (int i = 0; i < size; i++) {
         arr[i] = i;
         hashSet.add(i);
         treeSet.add(i);
     }

     // Defining target element
     int target = size - 1;

     // ---------------- Array Search ----------------

     // Storing start time for Array search
     long arrayStart = System.nanoTime();

     // Performing Array search
     ArraySearch.search(arr, target);

     // Storing end time for Array search
     long arrayEnd = System.nanoTime();

     // ---------------- HashSet Search ----------------

     // Storing start time for HashSet search
     long hashSetStart = System.nanoTime();

     // Performing HashSet search
     HashSetSearch.search(hashSet, target);

     // Storing end time for HashSet search
     long hashSetEnd = System.nanoTime();

     // ---------------- TreeSet Search ----------------

     // Storing start time for TreeSet search
     long treeSetStart = System.nanoTime();

     // Performing TreeSet search
     TreeSetSearch.search(treeSet, target);

     // Storing end time for TreeSet search
     long treeSetEnd = System.nanoTime();

     // Printing execution times
     System.out.println("Array Search Time (ns): " + (arrayEnd - arrayStart));
     System.out.println("HashSet Search Time (ns): " + (hashSetEnd - hashSetStart));
     System.out.println("TreeSet Search Time (ns): " + (treeSetEnd - treeSetStart));
 }
}
