
import javax.swing.JOptionPane;

public class PassOrFail {

	public static void main(String[] args) {
		// get a score from user
		//1. tell the user whether itś a passing or failing score.
			int score;
			String strScore, strOutput, grade;
			
		//2. gather inputs
			strScore = JOptionPane.showInputDialog("Enter the score");
					score = Integer.parseInt(strScore);
			
		//3. calc results 
			if ((score >= 0) && (score <= 100)) {
				if (score >= 60) {
					strOutput = "You entered " + score + "\nYouPassed!!";
				}
				else {
					strOutput="You entered " + score + "Better luck next time";
				}
			}
			else {
				strOutput="Invalid entry must be 0-100";
			}
		//4. display outputs 
			JOptionPane.showMessageDialog(null, strOutput);
	}
}
