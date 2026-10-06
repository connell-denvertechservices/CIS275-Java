import javax.swing.JOptionPane;

public class For1 {

	public static void main(String[] args) {
		// This program prompts the  user to enter an integer and it 
		//prints all the integers from 0 to that integer
		//declare vars and consts
		
		String strInput, strOutput;
		int input=-1;
		
		//gather inputs
		do {
			try {
				strInput = JOptionPane.showInputDialog("Enter a positive int");
					input = Integer.parseInt(strInput);
				if (input >=0) {
					//do the calculations
				}
				else {
					JOptionPane.showMessageDialog(null,"error positive ints only");
				}
			}catch (NumberFormatException ex) {
				JOptionPane.showInternalMessageDialog(null, ex);
			}
		} while(input <=0); 
		// calc results
		int i = 0;
		while (i <= input) {
			if (i % 2 == 0)
			strOutput = strOutput + " " + i;
		}
		i = i+1;
		for (i = 0; i<=input; i++) {
			if (i % 2 == 0) {
				strOutput = strOutput + " " + i;
			}
		}
		
		//display outs

	}
	JOptionPane.showMessageDialog(null, strOutput);

}
