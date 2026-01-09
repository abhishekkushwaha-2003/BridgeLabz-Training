package com.algorithmruntimeanalysisandbigonotation.comparedatastructureforsearching;

import java.util.*;

//This class performs search using TreeSet
class TreeSetSearch {

 // This method checks if element exists in TreeSet
 static boolean search(TreeSet<Integer> set, int target) {

     // Checking presence of target in TreeSet
     return set.contains(target);
 }
}
