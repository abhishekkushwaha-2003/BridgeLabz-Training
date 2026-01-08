package com.bookbazaar;

//Main class to test BookBazaar system
public class BookBazaarApp {

 public static void main(String[] args) {

     // Creating book objects
     Book ebook = new EBook(
             "Java Made Easy",
             "James Gosling",
             500,
             50
     );

     Book printedBook = new PrintedBook(
             "Clean Code",
             "Robert C. Martin",
             700,
             20
     );

     // Creating orders
     Order order1 = new Order(ebook, 2);
     Order order2 = new Order(printedBook, 3);

     // Displaying total costs
     System.out.println("EBook Order Total: ₹" + order1.calculateTotalCost());
     System.out.println("Printed Book Order Total: ₹" + order2.calculateTotalCost());
 }
}
