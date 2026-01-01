/*17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking.*/

import java.util.Scanner;
public class OnlineQuizApplication{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		// array of questions
		String[] questions = {
			"1. What is 15 + 25 ?\nA. 30\nB. 35\nC. 40\nD. 45",
			"2. What is 100 - 45 ?\nA. 55\nB. 50\nC. 45\nD. 60",
			"3. What is 12 * 4 ?\nA. 36\nB. 48\nC. 52\nD. 56",
			"4. What is 81 ÷ 9 ?\nA. 7\nB. 8\nC. 10\nD. 9",
			"5. What is the square of 6 ?\nA. 12\nB. 24\nC. 36\nD. 48"
		};

		// correct answers
		char[] answers = {'C','A','B','D','C'};

		int score = 0;

		// loop through questions
		for(int i = 0; i < questions.length; i++){
			System.out.println(questions[i]);
			System.out.print("Enter your answer: ");
			char userAnswer = sc.next().toUpperCase().charAt(0);

			// switch for answer checking
			switch(userAnswer){
				case 'A':
				case 'B':
				case 'C':
				case 'D':
					if(userAnswer == answers[i]){
						System.out.println("Correct Answer!\n");
						score++;
					}else{
						System.out.println("Wrong Answer!\n");
					}
					break;

				default:
					System.out.println("Invalid Option!\n");
			}
		}

		// final score
		System.out.println("Your Total Score is: " + score + " out of 5");

		sc.close();
	}
}
