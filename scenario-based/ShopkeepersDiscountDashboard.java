import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // constants for discount percentages
        final double discountTenPer = 0.10;
        final double discountTwentyPer = 0.20;

        // variable to store total bill amount
        double totalBill = 0;

        // asking number of items
        System.out.print("Enter number of items: ");
        int items = sc.nextInt();

        // taking price of each item using for loop
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        // displaying total bill before discount
        System.out.println("\nTotal Bill Amount: Rs. " + totalBill);

        double discount = 0;

        // applying discount using if-else
        if (totalBill >= 5000) {
            discount = totalBill * discountTwentyPer;
            System.out.println("You got 20% discount");
        } 
        else if (totalBill >= 2000) {
            discount = totalBill * discountTenPer;
            System.out.println("You got 10% discount");
        } 
        else {
            System.out.println("No discount available");
        }

        // calculating final amount
        double finalAmount = totalBill - discount;

        // displaying discount and final payable amount
        System.out.println("Discount Amount: Rs. " + discount);
        System.out.println("Final Payable Amount: Rs. " + finalAmount);

        sc.close();
    }
}
