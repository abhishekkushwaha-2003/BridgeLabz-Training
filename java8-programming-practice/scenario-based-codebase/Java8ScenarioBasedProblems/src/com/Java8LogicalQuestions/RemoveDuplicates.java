package com.Java8LogicalQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicates {

		    public static void main(String[] args) {
		    	   List<Integer>list=List.of(1, 2, 2, 3, 4, 4, 5);
			List<Integer>newList= list.stream().distinct().collect(Collectors.toList());
			 System.out.println(newList);
		    }

		}