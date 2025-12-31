/*20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

// import Scanner class to take user input
import java.util.Scanner;
// create a FestivalLuckyDraw class 
public class FestivalLuckyDraw{
	public static void main(String [] args){
		// create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);
		// number of visitors
		int visitors = 1;
		// while loop runs for visitors 
		while(visitors<=5){
			// taking number as input and storing it
			
			System.out.println("Enter Drawn number of visitor : "+visitors);
			int drawNumber = sc.nextInt();
			// checking for gift eligibility
			if(drawNumber % 3 == 0 && drawNumber % 5 == 0){
				System.out.println("Hurray! Visitor "+visitors+", You Won A Gift!");
				visitors--;
				break;
			}else{
				// if he/she doesn't won then next visitor will get chance
				System.out.println("Sorry! Better Luck Next Time");
				visitors++;
				continue;
			}
		}
			sc.close();
	
	}
}