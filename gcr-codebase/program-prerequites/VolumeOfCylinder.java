import java.util.Scanner;
public class VolumeOfCylinder {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of cylinder : ");
		int radius = sc.nextInt();
		System.out.print("Enter height of cylinder : ");
		int height = sc.nextInt();
		double volume = 3.14 * radius * radius * height;

		System.out.print("Volume of a cylinder : "+ volume);
	}
}