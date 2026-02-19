package com.Assessment.PizzaPulse;

public class PizzaUtil {
	public boolean validateOrderId(String orderId) throws InvalidPizzaOrderException{
		String regex="^PZ-\\d{3}$";
		if(!orderId.matches(regex)) {
			throw new InvalidPizzaOrderException("The order "+ orderId+ "is invalid");
		}
		return true;
	}
	public boolean validatePizzaType(String pizzaType) throws InvalidPizzaOrderException{
		if(!(pizzaType.equals("Margherita")|| pizzaType.equals("Veggie")||pizzaType.equals("Pepperoni")||pizzaType.equals("BBQ Chicken"))) {
			throw new InvalidPizzaOrderException("The pizza type "+ pizzaType+ "is invalid");
		}
		return true;
	}
	public boolean validateQuantity(int quantity) throws InvalidPizzaOrderException{
		if(!(quantity>0 && quantity<=50)) {
			throw new InvalidPizzaOrderException("The quantity "+ quantity+ "is invalid");
			
		}
		return true;
	}
	public double calculateFinalBill(String pizzaType, double basePrice, int quantity) throws InvalidPizzaOrderException{
		
		if(basePrice<200) {
			throw new InvalidPizzaOrderException("Invalid base price for"+ pizzaType);
		}
		double toppingPercent = 0 ;
		
		switch(pizzaType) {
		case "Margherita":
		toppingPercent=10;
		break;
		
		case "Veggie":
			toppingPercent=15;
			break;
		case "Pepperoni":
			toppingPercent=20;
			break;
		case "BBQ Chicken":
			toppingPercent=25;
			break;
			
		}
	double	baseCost = basePrice * quantity;
	double toppingCharge = (baseCost * toppingPercent) / 100;
	final double deliveryFee = 100;
	double finalBill = baseCost + toppingCharge +deliveryFee;
	return finalBill;
	}
}
