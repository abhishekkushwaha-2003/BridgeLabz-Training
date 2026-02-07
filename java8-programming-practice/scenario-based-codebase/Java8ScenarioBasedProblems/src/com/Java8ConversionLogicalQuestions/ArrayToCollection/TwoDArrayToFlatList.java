package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;
import java.util.stream.*;

public class TwoDArrayToFlatList {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        List<Integer> list = Arrays.stream(arr)
                                   .flatMapToInt(Arrays::stream)
                                   .boxed()
                                   .toList();

        System.out.println(list);
    }
}

