// Create a class PersonVoting to check a person is eligible for vote or not 

import java.util.Scanner;

public class PersonVoting{
	public static void main (String [] args){

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter Age of Person : ");

		int age = sc.nextInt();

		if(age >= 18 ){

		System.out.print("The person's age is "+age+" and can vote");

		} else {

		System.out.print("The person's age is "+age+" and cannot vote");


		}
	
	}
}