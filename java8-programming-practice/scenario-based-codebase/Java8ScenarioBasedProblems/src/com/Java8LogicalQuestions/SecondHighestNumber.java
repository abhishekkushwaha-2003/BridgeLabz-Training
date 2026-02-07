package com.Java8LogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondHighestNumber {

			    public static void main(String[] args) {
			    	   List<Integer>list=List.of(10,40,30,20);
				Integer secHighest=  list.stream()
						.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
				System.out.println(secHighest);
			    }
			    }

	