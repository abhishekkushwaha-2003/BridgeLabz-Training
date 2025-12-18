import java.util.*;
public class UserInputStudentFees{
	public  static void main(String [] args){
		

		Scanner sc = new Scanner(System.in);
		int fees = sc.nextInt();
		int discountPercent = sc.nextInt();			
		int discount = (fees*discountPercent)/100;	
		int remainingFees = fees - discount;
		
		System.out.print("The discount amount is INR "+discount+" and the final discounted fees is INR "+remainingFees);

		}
}