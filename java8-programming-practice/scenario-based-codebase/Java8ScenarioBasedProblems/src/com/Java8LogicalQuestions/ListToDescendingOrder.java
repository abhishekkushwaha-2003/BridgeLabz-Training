package com.Java8LogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListToDescendingOrder {

			    public static void main(String[] args) {
			    	   List<Integer>list=List.of(5,1,9,3);
				List<Integer>newList= list.stream()
						.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
				System.out.println(newList);
			    }

			}