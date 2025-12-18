import java.util.Scanner;
public class AverageThreeNumbers {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		double firstNumber = sc.nextDouble();
		double secondNumber = sc.nextDouble();
		double thirdNumber = sc.nextDouble();
		double average = (firstNumber  +secondNumber + thirdNumber) / 3;

		System.out.print("Average is : "average);

	}
}