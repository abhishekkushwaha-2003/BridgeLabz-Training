package com.Java8LogicalQuestions;

import java.util.*;
public class VowelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
	
	long counts= str.toLowerCase().chars().filter(c-> "aeiou".indexOf(c)!=-1).count();
	System.out.println(counts);

	}

}
