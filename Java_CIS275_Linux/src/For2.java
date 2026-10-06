
public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loops are for finite ranges of values
		//sum the vals from 0 to 100
		int sum = 0;
		double avg = 0;
		int i
		for (i = 0; i <= 100; i++) {
				sum = sum + i;
				}
		System.out.println(i);
		avg = sum/100;
		System.out.println("The sum of ints from 0 to 100 is" + sum);
		System.out.println("The avg of those is " + avg);
		//equiv while loop
		i = 0;
		sum = 0;
		while (i<=100) {
			sum = sum + i;
			i++;
		}

	}

}
