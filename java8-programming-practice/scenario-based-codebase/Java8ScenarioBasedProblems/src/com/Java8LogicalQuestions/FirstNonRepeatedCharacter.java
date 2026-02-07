package com.Java8LogicalQuestions;

import java.util.stream.Collectors;
import java.util.*;

public class FirstNonRepeatedCharacter {

			   public static void main(String[] args) {
			    Scanner sc= new Scanner(System.in);
			    System.out.println("enter a string");
			     String str= sc.nextLine().toLowerCase();

				Character ch =str.chars()
		                   .mapToObj(c -> (char) c)
		                   .filter(c->str.indexOf(c) == str.lastIndexOf(c)).findFirst().orElse(null);
				 System.out.println(ch);
			    }
	}
		