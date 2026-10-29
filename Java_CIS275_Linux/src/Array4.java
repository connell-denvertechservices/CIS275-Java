import javax.swing.JOptionPane;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr - new int[5];
		String strInput;
		
		for (int i = 0; i < arr.length; i++ {
			try {
				strInput = JOptionPane.showInputDialog(" Enter an int");
				arr[i] = Integer.parseInt(strInput); 
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,ex);
			}
	}
	
	avg = getArrayAverage(arr);
	System.out.println("The average is " + avg);

	}
	
	private static double getArrayAverage(int[] arr) {
		double average = 0;
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; //sum+=arr[i]
		}
		average = sum/arr.length;
		return average;
	}

}
