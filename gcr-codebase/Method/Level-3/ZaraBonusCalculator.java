// Program to calculate bonus for 10 employees of Zara
// based on years of service and calculate total old salary, new salary and bonus

import java.util.Random;

public class ZaraBonusCalculator {

    public static void main(String[] args) {

        int employeeCount = 10;

        // Generate random salary and years of service for employees
		
        int[][] employeeData = generateSalaryAndService(employeeCount);

        // Display salary and years of service
		
        System.out.println("Employee\tOld Salary\tYears of Service");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.println((i + 1) + "\t\t" + employeeData[i][0] + "\t\t" + employeeData[i][1]);
        }

        // Calculate bonus and new salary
		
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Display updated salary and bonus
		
        System.out.println("\nEmployee\tNew Salary\tBonus");
        for (int i = 0; i < updatedData.length; i++) {
            System.out.println((i + 1) + "\t\t" + (int)updatedData[i][0] + "\t\t" + (int)updatedData[i][1]);
        }

        // Step 3: Calculate total old salary, total new salary and total bonus
        double[] totals = calculateTotals(employeeData, updatedData);

        System.out.println("\nTotal Old Salary: " + (int)totals[0]);
        System.out.println("Total New Salary: " + (int)totals[1]);
        System.out.println("Total Bonus: " + (int)totals[2]);
    }

    // Method to generate random salary and years of service
	
    public static int[][] generateSalaryAndService(int employeeCount) {

        int[][] data = new int[employeeCount][2];
        Random random = new Random();

        for (int i = 0; i < employeeCount; i++) {
		
            // generate random 5-digit salary: 10000 to 99999
			
            int salary = random.nextInt(90000) + 10000;

            // generate random years of service: 1 to 10
            int years = random.nextInt(10) + 1;

            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    // Method to calculate bonus and new salary
	
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {

        double[][] newData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = 0;

            if (years > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }

            double newSalary = salary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }

        return newData;
    }

    // Method to calculate total old salary, total new salary and total bonus
	
    public static double[] calculateTotals(int[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }

        double[] totals = new double[3];
        totals[0] = totalOldSalary;
        totals[1] = totalNewSalary;
        totals[2] = totalBonus;

        return totals;
    }
}
