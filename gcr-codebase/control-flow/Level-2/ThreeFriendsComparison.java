// Create a class ThreeFriendsComparison to compare the age and height of three friends Amar, Akbar, and Anthony

import java.util.Scanner;
public class ThreeFriendsComparison{
	public static void main (String []args){
	
		// Creating a scanner object to age and height as input
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age of Amar : ");
		
		int amarAge = sc.nextInt();
		
		System.out.print("Enter age of Akbar : ");
		
		int akbarAge = sc.nextInt();
		
		System.out.print("Enter age of Anthony : ");
		
		int anthonyAge = sc.nextInt();
		
		System.out.print("Enter height of Amar : ");
		
		double amarHeight = sc.nextDouble();
		
		System.out.print("Enter height of Akbar : ");
		
		double akbarHeight = sc.nextDouble();
		
		System.out.print("Enter height of Anthony : ");
		
		Double anthonyHeight = sc.nextDouble();

		// checking condition of age, whose is younger
		
		if(amarAge < akbarAge && amarAge < anthonyAge){
		System.out.println("The youngest friend is Amar whose Age is : "+amarAge);
		
		} else if(akbarAge < amarAge && akbarAge < anthonyAge){
		System.out.println("The youngest friend is Akbar whose Age is : "+akbarAge);
		
		} else {
		System.out.println("The youngest friend is Anthony whose Age is : "+anthonyAge);
		
		}
		
		// checking condition of height, whose is largest
		
		if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
		System.out.println("The largest friend is Amar whose height is : "+amarHeight);
		
		} else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
		System.out.println("The largest friend is Akbar whose height is : "+akbarHeight);
		
		} else {
		System.out.println("The largest friend is Anthony whose height is : "+anthonyHeight);
		
		}
		
		
		sc.close();
	
	}
}