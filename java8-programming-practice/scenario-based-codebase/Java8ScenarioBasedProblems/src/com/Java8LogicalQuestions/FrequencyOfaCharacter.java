package com.Java8LogicalQuestions;

import java.util.stream.Collectors;
import java.util.*;

public class FrequencyOfaCharacter {

		    public static void main(String[] args) {
		    	   Scanner sc= new Scanner(System.in);
		    	   System.out.println("enter a string");
		    	   String str= sc.nextLine();
			Map<Character, Long>newList=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
			 System.out.println(newList);
		    }
}
		