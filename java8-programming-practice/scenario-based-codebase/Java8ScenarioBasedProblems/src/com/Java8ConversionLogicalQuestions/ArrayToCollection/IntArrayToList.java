package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;
import java.util.stream.*;

public class IntArrayToList {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        List<Integer> list = Arrays.stream(arr)
                                   .boxed()
                                   .toList();

        System.out.println(list);
    }
}
