import javax.swing.JOptionPane;

public class JohnConnellICE2 {

	public static void main(String[] args) {
		//1. Declare the variables 
			//NumGallons - must be type double when passing to String.format
		double numGallons, numBillValue;
		final double cusBaseCharge;
		String strCusNumber, strCusName, strNumGallons, strOutput;
		
		
		//2. Assign values to the variables
			//gather the inputs with showInputDialog
			//We are using Integer.parseInt, for doubles use Doubles.parseDoubles
		cusBaseCharge = 16.33;
		strCusNumber = JOptionPane.showInputDialog("Enter customer number: ");
		strCusName = JOptionPane.showInputDialog("Enter customer name: ");
		strNumGallons = JOptionPane.showInputDialog("Enter the number of gallons: ");
		numGallons = Integer.parseInt(strNumGallons);
		
		numBillValue = cusBaseCharge + numGallons * 2.53e-3;
		
		//3. Math it out
		
		
		//4. Display the outs
			//String.format converts stuff into strings. 
		strOutput = "WATER BILL: \nCustomer Number: " + strCusNumber +
				"\nCustomer Name: " + strCusName +
				"\nGallons: " + strNumGallons +
				"\nBill Value: $" + String.format("%.2f", numBillValue);
		
		
		JOptionPane.showMessageDialog(null, strOutput);
	}

}
