// create a class SpringSeason to check the season is Spring or not

import java.util.Scanner;

public class SpringSeason{
	public static void main (String [] args){

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter Month : ");

		int month = sc.nextInt();

		System.out.print("Enter Day : ");

		int day = sc.nextInt();
      		
		// check condtion for day and month

		if( month >2 && month < 6){
		
		System.out.print("It is a Spring Season");

               } else if ((month == 3 && day >= 20) || ( month == 6  && day <=20)){
		
		System.out.print("It is a Spring Season");
		
		} else {

		System.out.print("It is Not a Spring Season");


				}
		
		sc.close();		

             }

}