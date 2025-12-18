// Create a class  IntOperation to perform some operations

import java.util.Scanner;
public class  IntOperation{
	public static void main (String[] args){
	
		// Create a scanner object for input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		
		int a = sc.nextInt();
		
		System.out.print("Enter second number : ");
		
		int b = sc.nextInt();
		
		System.out.print("Enter third number : ");
		
		int c = sc.nextInt();
		
		// performing operations and storing them 
		
		int ans1 =  a + b *c;
		
		int ans2 =   a * b + c;
		
		int ans3 =  c + a / b;
		
		int ans4 = a % b + c;
		
		System.out.print(" The results of Int Operations are "+ans1+", "+ans2+", "+ans3+" and "+ans4);
		
		sc.close();
		
		
	}
}