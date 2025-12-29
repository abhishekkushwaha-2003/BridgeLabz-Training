// import Random and Scanner class 
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
	public static void main (String [] args){
		
	// create a Scanner object
	Scanner sc = new Scanner (System.in);
	
	int min = 1, max = 100;
	
	// create a Random object
	Random rd = new Random();
	
	int randomNumber = rd.nextInt((max - min) + 1) + min;
	
	int chances = 0;
	
	// do while loop
	do{
		chances ++;
		System.out.println("Guess any Number between 1 to 100 ");
	    int number = sc.nextInt();
		if(number < randomNumber){
			System.out.println("The number you entered is : Too Low");
		}else if (number > randomNumber){
			System.out.println("The number you entered is : Too High");
		}else {
			System.out.println("You Won!!");
		break;
		}
	}
	
	// loop for 5 iteration 
	while(chances < 5);
	
	System.out.println("Game Over and the number was "+randomNumber);
	
	}
}