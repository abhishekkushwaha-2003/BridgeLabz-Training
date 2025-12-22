// Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.


import java.util.Scanner;

// create a class ZaraCompany to find the bonus amount  

public class ZaraCompany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store salary, years, bonus and new salary
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();

            //If invalid input, ask again
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; 
            }
        }

        // Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (years[i] > 5){
                bonus[i] = salary[i] * 0.05; // 5% bonus
				}
            else{
                bonus[i] = salary[i] * 0.02; // 2% bonus
				}

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
			
        }

        // Displaying results
        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
