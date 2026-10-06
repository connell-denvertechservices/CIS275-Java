import javax.swing.JOptionPane;

public class Inclass_while_loops {

	public static void main(String[] args) {
		//Print all the integers from 0 to 9
		String strOutput;
		int i = 0;
		
		while (i<10) {
			System.out.println(i);
			i = i+1;
		}
		System.out.println("After the loop, i = " + i);
		strOutput = "";
		
		
		//JOptionPane.showMessageDialog(null, strOutput);
		//print 20 to 10 inclusive
		in j = 20;
		while (j >= 10); {
			System.out.println(j);
			j = j - 1; 
		}
		System.out.println("After the loop, j=" + j); 
		
		//sum the ints from 0 to 10;
		int k = 0;
		int mySum = 0;
		
		while (k <= 10) {
			mySum = mySum + k;
		}
		System.out.println("After the loop, k = "+ k + "and mySum = " + mySum);
		
		boolean validInput = false;
		String strInput;
		int input; 
		
		while (validInput == false) {
			strInput = JOptionPane.showInputDialog("Enter a positive int");
			input = Integer.parseInt(strInput);
			if (input > 0) {
				validInput = true;
			}
		}
	}

}

//loop for input caalidation
	
