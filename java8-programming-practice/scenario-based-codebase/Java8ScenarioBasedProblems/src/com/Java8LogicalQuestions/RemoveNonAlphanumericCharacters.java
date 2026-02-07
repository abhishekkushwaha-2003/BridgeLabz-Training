package com.Java8LogicalQuestions;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveNonAlphanumericCharacters {

		    public static void main(String[] args) {
		     String str="ja@va#8!!";
       String newStr=  str.chars().filter(c->Character.isLetterOrDigit(c)).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
			System.out.println(newStr);
		    }

		}

