// Create a class PriceOfItem to caculate the total price 

import java.util.Scanner;
public class PriceOfItem{
	public static void main (String [] args){
	
	// Create scanner object to take input of unit price of item

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Unit Price of item : ");
	
	int unitPrice = sc.nextInt();
	
	System.out.print("Enter Unit quantity of item : ");
	
	int itemQuantity = sc.nextInt();
	
	int totalprice = unitPrice * itemQuantity;
	
	System.out.print("The total purchase price is INR "+ totalprice+" if the quantity "+ itemQuantity +" and unit price is INR "+unitPrice);
	
	sc.close();
	
	}
}