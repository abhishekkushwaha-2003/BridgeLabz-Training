/* 15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/

import java.util.Scanner;
public class LibraryReminderApp{
	public static void main(String[] args){
	// create a Scanner object to take input from user
	Scanner sc = new Scanner (System.in);
	// create two variables book and fine to count book and fine
	int fine = 0;
	
	// while loop for 5 books details
	for(int book=1; book<=5; book++){
		System.out.println("Enter details of Book : "+book);
		System.out.println("Enter Due Date : ");
		// taking due date as input from user
		int dueDate = sc.nextInt();
		System.out.println("Enter Returned Date : ");
		// taking return date as input from user
		int returnDate = sc.nextInt();
		// checking for fine
		if(dueDate < 32 && returnDate < 32){
		if(returnDate>dueDate){
			fine = (returnDate - dueDate)*5;
			System.out.println("You have to pay the fine of "+fine+" Rupees.\n");
		}else{
			System.out.println("You Returned the Book on Time.\n");
			}
		}else{
			System.out.println("Entered Invalid Date\n");
		}
		}
		// closing scanner 
		sc.close();
	}
} 