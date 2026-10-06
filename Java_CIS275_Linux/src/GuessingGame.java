import java.util.Random;

import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//loop over and over until they get it, 
		// give them hints if they're too high or too low
		int targetNum, guess, numGuesses=0;
		String strOutput, strGuess;
		boolean guessedNum = false;
		Random randNum = new Random();
		
		//determine the random targetNum
		targetNum = randNum.nextInt(100); 
		
		//loop until user guesses the value
		while(!guessedNum) {
			//ask for a guess, parse it to Int
			strGuess = JOptionPane.showInputDialog("Guess and int from 0 to 99: ");
			guess = Integer.parseInt(strGuess);
			numGuesses = numGuesses++; 
			
			//evaluate how the user did
			if (guess > targetNum) {
				strOutput = "Your guess was too high, try again";
				JOptionPane.showMessageDialog(null,  strOutput);
			} else if (guess < targetNum) {
				JOptionPane.showMessageDialog(null, "Ÿour guess was too low");
			} else {
				JOptionPane.showMessageDialog(null, "Ÿou got it and it took you :" + numGuesses);
				guessedNum = true; 
			}
		}
	}

}
