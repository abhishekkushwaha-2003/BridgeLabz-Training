// Create a class  DoubleOpt to perform some operations

import java.util.Scanner;
public class  DoubleOpt{
	public static void main (String[] args){
	
		// Create a scanner object for input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		
		double a = sc.nextDouble();
		
		System.out.print("Enter second number : ");
		
		double b = sc.nextDouble();
		
		System.out.print("Enter third number : ");
		
		double c = sc.nextDouble();
		
		// performing operations and storing them 
		
		double ans1 =  a + b *c;
		
		double ans2 =   a * b + c;
		
		double ans3 =  c + a / b;
		
		double ans4 = a % b + c;
		
		System.out.print(" The results of Int Operations are "+ans1+", "+ans2+", "+ans3+" and "+ans4);
		
		sc.close();
		
		
	}
}