package com.Java8LogicalQuestions;

import java.util.*;

public class CountWords {
	
     public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter a sentence");
 		String str= sc.nextLine();
 	 long countWords= Arrays.stream(str.trim().split(" ")).count();
 	 System.out.println(countWords);
     }

}
