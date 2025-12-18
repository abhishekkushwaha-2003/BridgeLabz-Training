import java.util.*;
public class AddTwoNumbers {
      public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Number : ");
	int firstNumber = sc.nextInt();
	System.out.print("Enter Second Number : ");
	int secondNum = sc.nextInt();
	int sum = firstNumber + secondNum;
	System.out.print("The addition of two numbers : "+sum);
	}
}