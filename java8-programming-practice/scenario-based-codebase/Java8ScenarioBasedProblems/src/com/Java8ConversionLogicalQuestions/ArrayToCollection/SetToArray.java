package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;

public class SetToArray {
    public static void main(String[] args) {

        Set<Integer> set = Set.of(1, 2, 3);

        Integer[] arr = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr));
    }
}
