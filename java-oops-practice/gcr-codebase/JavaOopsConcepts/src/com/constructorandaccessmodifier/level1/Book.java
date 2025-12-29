package com.constructorandaccessmodifier.level1;

public class Book {

		// Attributes
		String title;
		String author;
		double price;
		
		
		// default constructor
		Book(){	
		title = "King";
		author = "Abhishek";
		price = 250.0;
			
	}
		// parameterized constructor
		Book(String title, String author, double price){
			this.title = title;
			this.author = author;
			this.price = price;
			
		}
		
		// Display Order Details
	    void displayOrderDetails() {
	        System.out.println("Book Title : " + title);
	        System.out.println("Author Name : " + author);
	        System.out.println("Price : " + price);
	    }

		// main method
		public static void main(String [] args) {
			
			// create object book1
			Book book1 = new Book();
			book1.displayOrderDetails();
		
			//create object book2
			Book book2 = new Book("Java", "Rajiv",150.0);
			book2.displayOrderDetails();
		}
		

}
