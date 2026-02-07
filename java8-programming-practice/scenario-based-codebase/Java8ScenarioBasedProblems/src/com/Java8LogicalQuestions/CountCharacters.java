package com.Java8LogicalQuestions;

import java.util.*;
import java.util.stream.Collectors;
public class CountCharacters {
		
	     public static void main(String[] args) {
	 	String str="java stream";
	 	Map<Character, Long>newList= str.chars().mapToObj(c->(char)c).filter(c->Character.isLetter(c)).collect(Collectors.groupingBy(c->c, Collectors.counting()));
	 	 System.out.println(newList);
	     }
}
	

