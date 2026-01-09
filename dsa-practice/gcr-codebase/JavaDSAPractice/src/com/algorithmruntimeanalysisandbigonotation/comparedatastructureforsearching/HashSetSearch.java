package com.algorithmruntimeanalysisandbigonotation.comparedatastructureforsearching;

import java.util.*;

//This class performs search using HashSet
class HashSetSearch {

 // This method checks if element exists in HashSet
 static boolean search(HashSet<Integer> set, int target) {

     // Checking presence of target in HashSet
     return set.contains(target);
 }
}
