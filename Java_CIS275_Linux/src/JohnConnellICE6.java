import java.util.Random;
import javax.swing.JOptionPane;

public class JohnConnellICE6 {

	public static int sumDiceRolls(int numDice) {
		Random randomNumber = new Random();
		int computerChoice;
		int sum = 0;
		for (int i = 0; i < numDice; i++) {
			computerChoice = randomNumber.nextInt(6) + 1;
			sum += computerChoice;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] diceSumCounter = new int[13];
		int numRolls;

		numRolls = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of dice rolls to simulate"));

		//append diceSumCounter with dice rolls
		for (int i = 0; i < numRolls; i++) {
			diceSumCounter[sumDiceRolls(2)]++;
		}

		//Returns the percentage value each integer 2 through 12 is rolled.
		JOptionPane.showMessageDialog(null, "After simulating " + numRolls +" rolls of 2 dice, here are the results\n"
				+ "2: " + String.format("%.2f%%\n", 100.0 * diceSumCounter[2] / numRolls)
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
