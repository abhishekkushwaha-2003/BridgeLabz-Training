// Write a Java program to design an Election Booth Manager system.

import java.util.Scanner;
public class ElectionBoothMaanger {
	public static void main(String [] args){
		
		//create a Scanner object	
		Scanner sc = new Scanner(System.in);
	
		//votes[0] = A, votes[1] = B, votes[2] = C
		int []votes = new int[3];
	
		//infinite loop
		while(true){
		
			System.out.print("Enter Age (or -1 to exit): ");
			int age = sc.nextInt();
		
			if(age == -1){
				break;
			}
		
			if(isEligible(age)){
				System.out.println("You are eligible to vote,");
			
				displayMenu();
			
				int choice = sc.nextInt();
				recordVote(choice, votes);
			}
			else{
				System.out.println("You are not eligible to vote.");
			}
		}
	
		displayResult(votes);
		// closing scanner class 
		sc.close();
		
	}

	//find a candidate a eligible or not
	public static boolean isEligible(int age){
		return age >= 18;
	}
	
	//display a voting menu
	public static void displayMenu(){
		System.out.println("Press 1 for Candidate A");
		System.out.println("Press 2 for Candidate B");
		System.out.println("Press 3 for Candidate C");
	}
	
	//record votes
	public static void recordVote(int choice, int[] votes){
		if(choice >= 1 && choice <= 3){
			votes[choice - 1]++;
		}
		else{
			System.out.println("Invalid vote! ");
		}
	}
	
	//method to display a results
	public static void displayResult(int [] votes){
		System.out.println("Election Results");
		System.out.println("Candidate A votes : "+votes[0]);
		System.out.println("Candidate B votes : "+votes[1]);
		System.out.println("Candidate C votes : "+votes[2]);
	}
	
	
}