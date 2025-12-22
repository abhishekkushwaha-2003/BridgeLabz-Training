/* Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. */

//class create a RandomNumbers
public class RandomNumbers {

    public static void main(String[] args) {

        RandomNumbers obj = new RandomNumbers();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Find average, min and max
        double[] result = obj.findAverageMinMax(randomNumbers);

        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + (int) result[1]);
        System.out.println("Maximum = " + (int) result[2]);
    }

  // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random number between 1000 and 9999
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // Method to find average, minimum and maximum
    public double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }
}
