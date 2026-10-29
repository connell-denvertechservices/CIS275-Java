import java.util.Random;
import javax.swing.JOptionPane;

public class JohnConnellICE6 {
	
	//Method sumDiceRolls returns the roll of a die. Parameter numDice is the number of dice (2).
	public static int sumDiceRolls(int numDice) {
		Random randomNumber = new Random();
		int computerChoice; //This is the actual value of 1 roll
		int sum = 0; // This is the value after both rolls
		for (int i = 0; i < numDice; i++) { //This loop runs once per # of dice
			computerChoice = randomNumber.nextInt(6) + 1; // Computer choice is assigned a number 1-6. 
			sum += computerChoice;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] diceSumCounter = new int[13];
		int numRolls;

		numRolls = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of dice rolls to simulate"));

		//append the array with # of dice rolls
		for (int i = 0; i < numRolls; i++) {
			diceSumCounter[sumDiceRolls(2)]++; //increment the array place holder rolled by two dice  
		}

		//Returns the percentage value each integer 2 through 12 is rolled.
		JOptionPane.showMessageDialog(null, "After simulating " + numRolls +" rolls of 2 dice, here are the results\n"
				+ "2: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[2] / numRolls) // Return as a percentage the number of rolls per each integer
				+ "3: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[3] / numRolls)
				+ "4: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[4] / numRolls)
				+ "5: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[5] / numRolls)
				+ "6: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[6] / numRolls)
				+ "7: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[7] / numRolls)
				+ "8: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[8] / numRolls)
				+ "9: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[9] / numRolls)
				+ "10: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[10] / numRolls)
				+ "11: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[11] / numRolls)
				+ "12: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[12] / numRolls));

	}

}
