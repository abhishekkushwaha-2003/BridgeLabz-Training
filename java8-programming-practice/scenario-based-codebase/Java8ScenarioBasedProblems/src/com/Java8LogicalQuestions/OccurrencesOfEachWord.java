package com.Java8LogicalQuestions;

import java.util.stream.*;
import java.util.Arrays;
import java.util.*;
	
public class OccurrencesOfEachWord {
	
	     public static void main(String[] args) {
	 	String str="java is java and java is fast";
	 	
	 	Map<String, Long>newList= Arrays.stream(str.trim().split(" ")).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
	 	 System.out.println(newList);
	     }

	}
