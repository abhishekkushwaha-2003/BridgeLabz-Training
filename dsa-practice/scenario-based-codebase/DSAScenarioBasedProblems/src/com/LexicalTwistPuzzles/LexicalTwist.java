package com.LexicalTwistPuzzles;
import java.util.Scanner;

public class LexicalTwist {
	
	public static boolean reverseWord(String word1, String word2, int n, int m) {
		if(n == m) {
			int i = 0;
			int j = n-1;
			while(i<j) {
				if(word1.charAt(i) != word2.charAt(j)) {
					return false;
				}
					i++;
					j--;
			}
			
			return true;
				
		}
		return false;
	}
	
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First Word : ");
		String str1 = sc.nextLine();
		
		if(str1.contains(" ")) {
			System.out.println(str1+" is an invalid word");
			return;
		}
		
		System.out.println("Enter Second Word : ");
		String str2 = sc.nextLine();
		
		if(str2.contains(" ")) {
			System.out.println(str2+" is an invalid word");
			return;
		}
		
		String word1 = str1.toLowerCase();
		String word2 = str2.toLowerCase();
		
		int n = word1.length();
		int m = word2.length();
	
		
		if(reverseWord(word1, word2, n, m)) {
			StringBuilder sb = new StringBuilder(word2);
			
			for(int i=0; i<sb.length(); i++) {
				char ch = sb.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					sb.setCharAt(i, '@');
				}
			}
			
			System.out.println(sb.toString());
			return;
		}
		
		
		String word3 = (word1 + word2).toUpperCase();
		int vowel = 0, consonant = 0;
		for(int i=0; i<word3.length(); i++) {
			char ch = word3.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				if(ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U') {
					vowel++;
				} else {
					consonant++;
				}
			}
		}

		if(vowel == consonant) {
			System.out.println("Vowels and Consonants are Equal!");
		}
		else if(vowel > consonant) {
			StringBuilder sb = new StringBuilder(word3);
			StringBuilder newsb = new StringBuilder();
			int count = 0;
			for(int i=0; i<sb.length()-1; i++) {
				
				if(sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O' || sb.charAt(i)=='U') {
					newsb.append(sb.charAt(i));
					count++;
					if(sb.charAt(i) == sb.charAt(i+1)) {
						sb.deleteCharAt(i);
					}
				}
				if(count == 2) {
					break;
				}
			}
		

			System.out.println(newsb.toString());
			
		}else {
			StringBuilder sb = new StringBuilder(word3);
			StringBuilder newsb = new StringBuilder();
			int count = 0;
			for(int i=0; i<sb.length()-1; i++) {
				if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
					if(sb.charAt(i)!='A' && sb.charAt(i)!='E' && sb.charAt(i)!='I' && sb.charAt(i)!='O' && sb.charAt(i)!='U') {
						newsb.append(sb.charAt(i));
						count++;
						if(sb.charAt(i) == sb.charAt(i+1)) {
							sb.deleteCharAt(i);
						}
						
					}
					if(count == 2) {
						break;
					}
			}
			
			System.out.println(newsb.toString());
		}
		
	}
}
