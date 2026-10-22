import javax.swing.JOptionPane;

public class JohnConnellICE5 {
	
	//Formula to calculate a monthly payment
	public static double calculateMonthlyPayment(double loanAmount, int years, double interestRate) {
		double periodicRate, discountFactor;
		int numPayments; 
		
		numPayments = years * 12;
		periodicRate = ( interestRate / 100) / 12; 
		discountFactor = (Math.pow(1 + periodicRate, numPayments) - 1) / (periodicRate * Math.pow(1 + periodicRate, numPayments));
		
		return loanAmount / discountFactor;
	}
	//Main method gathers inputs and returns a calculated monthly amount. 
	public static void main(String[] args) {
		
		double loanAmount, interestRate, monthlyPayment;
		int years; 
		
		loanAmount = Double.parseDouble(JOptionPane.showInputDialog("This program will calculate a monthly loan payment "
				+ "amount based on the loan parameters provided by you. "
				+ "\nTo start, please enter the total loan amount."));
		years = Integer.parseInt(JOptionPane.showInputDialog("How many years is the loan for?"));
		interestRate = Double.parseDouble(JOptionPane.showInputDialog("What is the annual interest rate?"));
		

		monthlyPayment = calculateMonthlyPayment(loanAmount, years, interestRate); 
		
		
		
		JOptionPane.showMessageDialog(null, "For a " + years + " year loan of $" +
		String.format("%.2f", loanAmount) + " at a " + interestRate 
		+ "% interest rate, your monthly payment will be $" + String.format("%.2f", monthlyPayment));
	}

}
