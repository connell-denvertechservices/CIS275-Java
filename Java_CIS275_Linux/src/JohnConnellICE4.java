import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JohnConnellICE4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();
		int computerChoice, intRounds, gameRock, gamePaper, gameScissors, intWins, intLosses, intTies;
		String strOutput, userName, userWinner;

		gameRock = 1;
		gamePaper = 2;
		gameScissors = 3;
		intWins = 0;
		intLosses = 0;
		intTies = 0;

		userName = JOptionPane.showInputDialog("Please enter your name");
		intRounds = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of rounds you would like to play"));

		for (int i = 1; i <= intRounds; i++) {
			int userChoice = 0;

			do {
				try {
					userChoice = Integer.parseInt(JOptionPane.showInputDialog("Round " + i + ": Enter " + gameRock + " for Rock, " + gamePaper + " for Paper, or " + gameScissors + " for Scissors"));

					if (userChoice < gameRock || userChoice > gameScissors) {
						JOptionPane.showMessageDialog(null, "Invalid value. Number of rounds must be a positive number. Pleasse try again " + gameRock + ", " + gamePaper + ", or " + gameScissors + ".");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "You entered an invalid value. Please try again. " + gameRock + ", " + gamePaper + ", or " + gameScissors + ".");
					userChoice = 0;
				}
			} while (userChoice < gameRock || userChoice > gameScissors);

			do {
				computerChoice = randomNumber.nextInt(3) + 1;
			} while (computerChoice < gameRock || computerChoice > gameScissors);

			if (userChoice == computerChoice) {
				intTies++;
				userWinner = "Nobody";
			} else if ((userChoice == gameRock && computerChoice == gameScissors)
					|| (userChoice == gamePaper && computerChoice == gameRock)
					|| (userChoice == gameScissors && computerChoice == gamePaper)) {
				intWins++;
				userWinner = userName;
			} else {
				intLosses++;
				userWinner = "The computer";
			}

			String userChoiceName, computerChoiceName;

			if (userChoice == gameRock) {
				userChoiceName = "Rock";
			} else if (userChoice == gamePaper) {
				userChoiceName = "Paper";
			} else {
				userChoiceName = "Scissors";
			}

			if (computerChoice == gameRock) {
				computerChoiceName = "Rock";
			} else if (computerChoice == gamePaper) {
				computerChoiceName = "Paper";
			} else {
				computerChoiceName = "Scissors";
			}

			strOutput = "Round " + i + ": " + userName + " chose " + userChoiceName + ", computer chose " + computerChoiceName + ". " + userWinner + " wins this round.";
			JOptionPane.showMessageDialog(null, strOutput);

		}

		if (intWins > intLosses) {
			userWinner = userName + " is the final winner!";
		} else if (intLosses > intWins) {
			userWinner = "The computer is the final winner!";
		} else {
			userWinner = "The game ends in a tie!";
		}

		strOutput = "Games played: " + intRounds
				+ "\n" + userName + "'s wins: " + intWins
				+ "\nComputer's wins: " + intLosses
				+ "\nTies: " + intTies
				+ "\n\n" + userWinner;
		JOptionPane.showMessageDialog(null, strOutput);

	}
}
