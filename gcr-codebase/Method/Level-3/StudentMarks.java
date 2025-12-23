import java.util.Scanner;
public class StudentMarks{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int students = input.nextInt();

		//Generate marks and calculate results
		int[][] scores = generateScores(students);
		double[][] result = calculateResults(scores);
		//Display the final score
		displayScorecard(scores, result);
	}
	
	//Generate random PCM scores
	public static int[][] generateScores(int students){
		int[][] scores = new int[students][3];
		for (int i = 0; i < students; i++) {
			//Physics
			scores[i][0] = (int)(Math.random() * 90) + 10;
			//Chemistry
			scores[i][1] = (int)(Math.random() * 90) + 10;
			//maths
			scores[i][2] = (int)(Math.random() * 90) + 10;
		}
		return scores;
	}
	//Calculate total, average and percentage
	public static double[][] calculateResults(int[][] scores){
		double[][] result = new double[scores.length][3];
		for(int i=0; i<scores.length; i++){
			int total = scores[i][0] + scores[i][1] + scores[i][2];
			double avg = total / 3.0;
			double percent = (total/300.0) * 100;
			result[i][0] = total;
			result[i][1] = Math.round(avg * 100.0) / 100.0;
			result[i][2] = Math.round(percent * 100.0) / 100.0;
		}
		return result;
	}
	//Display scorecard
	public static void displayScorecard (int[][] scores, double[][] result){
		System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");
		for(int i=0; i<scores.length; i++){
			System.out.println(
				scores[i][0] + "\t" +
				scores[i][1] + "\t" +
				scores[i][2] + "\t" +
				result[i][0] + "\t" +
				result[i][1] + "\t" +
				result[i][2]
			);
		}
	}

}