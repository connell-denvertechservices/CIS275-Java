import javax.swing.JOptionPane;

public class JohnConnellICE3 {

	public static void main(String[] args) {
		//1. Declare the variables 
			double damagePoints;
			double damageMultPoints;
			String monsterName, stringDamagePoints, strOutput;
		
		
		//2. Assign values to the variables
		monsterName = JOptionPane.showInputDialog("Enter monster name: ");
		stringDamagePoints = JOptionPane.showInputDialog("Enter attack damage: ");
		
		damagePoints = Integer.parseInt(stringDamagePoints);
		
		
		//3. Math it out
		if ((damagePoints <= 50) && (damagePoints > 0)) {
			damageMultPoints = (damagePoints * 0.25);
		} else if ((damagePoints > 50) && (damagePoints <= 100)) {
			damageMultPoints = ((damagePoints - 50) * 0.5) + (50 * 0.25);
		} else {
			damageMultPoints = (damagePoints - 150) + (50 * 0.25) + (50 * 0.5); 
		}
		
		//4. Display the outs
		strOutput = monsterName + " attacked you. You health drained: -" + damageMultPoints;
		
		
		JOptionPane.showMessageDialog(null, strOutput);
	}

}
