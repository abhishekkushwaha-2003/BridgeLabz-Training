package com.Assessment.PizzaPulse;
import java.util.Scanner;
public class UserInterface {
public static void main(String [] args) {
	
	Scanner sc =new Scanner(System.in);
	PizzaUtil pu=new PizzaUtil();
	
	try {
		System.out.println("Enter pizza order details");
		String input= sc.nextLine();
		String [] parts= input.split(":");
		
		if(parts.length!=4) {
			System.out.println("invalid input");
			return;
		}
		String orderId=parts[0];
		String pizzaType= parts[1];
		double basePrice=Double.parseDouble(parts[2]);
		int quantity= Integer.parseInt(parts[3]);
		
		pu.validateOrderId(orderId);
		pu.validatePizzaType(pizzaType);
		pu.validateQuantity(quantity);
		
		double output= pu.calculateFinalBill(pizzaType, basePrice, quantity);
		System.out.println("Total bill for "+ pizzaType+ " pizzas: "+ output);	
		
	}
	catch(InvalidPizzaOrderException e) {
		System.out.println(e.getMessage());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
