// Program to play Rock-Paper-Scissors between user and computer
// Display results, total wins, and winning percentages

import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice randomly
	
    public static String getComputerChoice() {
        double rand = Math.random(); // 0.0 to 1.0
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }

    // Method to find winner
	
    public static String findWinner(String userChoice, String compChoice) {
        if (userChoice.equals(compChoice)) return "Draw";

        if (userChoice.equals("rock")) {
            return compChoice.equals("scissors") ? "User" : "Computer";
        } else if (userChoice.equals("paper")) {
            return compChoice.equals("rock") ? "User" : "Computer";
        } else if (userChoice.equals("scissors")) {
            return compChoice.equals("paper") ? "User" : "Computer";
        }

        return "Invalid";
    }

    // Method to calculate stats and percentage
	
    public static String[][] calculateStats(int userWins, int compWins, int draws, int totalGames) {
        String[][] stats = new String[3][3];

        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0 / totalGames));

        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", (compWins * 100.0 / totalGames));

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.format("%.2f%%", (draws * 100.0 / totalGames));

        return stats;
    }

    // Method to display results of each game and stats
    public static void displayResults(String[] userChoices, String[] compChoices, String[] winners, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----\t----\t--------\t------");

        for (int i = 0; i < userChoices.length; i++) {
            System.out.println((i + 1) + "\t" + userChoices[i] + "\t" + compChoices[i] + "\t\t" + winners[i]);
        }

        System.out.println("\nOverall Stats:");
        System.out.println("Result\t\tCount\tPercentage");
        System.out.println("------\t\t-----\t----------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];

        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice for game " + (i + 1) + " (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            userChoices[i] = userChoice;
            compChoices[i] = compChoice;
            winners[i] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, n);

        displayResults(userChoices, compChoices, winners, stats);
    }
}
