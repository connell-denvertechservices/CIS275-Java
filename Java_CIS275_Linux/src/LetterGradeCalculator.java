
import javax.swing.JOptionPane;


public class New_File {

	public static void main(String[] args) {
		int score;
		String strScore, strOutput, grade;

		strScore = JOptionPane.showInputDialog("Enter your score: ");
		score = Integer.parseInt(strScore);

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 0) {
			grade = "F";
		} else {
			grade = "Invalid";
		}

		strOutput = ("You entered " + score + " which is a " + grade);

		JOptionPane.showMessageDialog(null, strOutput);

	}

}
