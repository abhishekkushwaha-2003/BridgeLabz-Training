package com.Java8LogicalQuestions;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
public class KeepOnlyAlphabets {

		public static void main(String[] args) {
		 String str="java8stream2025";
	      String newStr=  str.chars().filter(c->Character.isLetter(c)).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
			System.out.println(newStr);
			    }

			}



