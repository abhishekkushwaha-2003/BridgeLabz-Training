package com.algorithmruntimeanalysisandbigonotation.comparedatastructureforsearching;

import java.util.*;

//This class performs search using Array (Linear Search)
class ArraySearch {

 // This method searches element in array using linear search
 static int search(int[] arr, int target) {

     // Looping through array elements one by one
     for (int i = 0; i < arr.length; i++) {

         // Checking if current element matches target
         if (arr[i] == target) {
             return i;
         }
     }

     // Returning -1 if element is not found
     return -1;
 }
}
