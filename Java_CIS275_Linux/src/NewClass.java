
public class NewClass {
	
	public static int max(int num1, int num2) {
		int result;
		
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		return result;
		
	}
	public static double max(double num1, double num2) {
		double result;
		if (num1 > num2) {
			result = num1;	
		} else {
			result = num2;
		}
		return result;
	}
	public static int max(int num1, int num2, int num3) {
		int result;
		return (max(max(num1, num2),num3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(3,2));
		
		int k = max(88, 89);
		System.out.println(k);
		
		int i = 76, j = 91;
		System.out.println(max(i,j));
		
		System.out.println(max(33.3, 22.2));
		
		//i want to find the max of three ints
		Systme.out.println(max(30,20,10));
	}

}
