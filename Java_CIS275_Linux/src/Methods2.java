
public class Methods2 {

	public static boolean isEven(int num) {
		boolean result;
		if (num % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		int num1 = 31;
		if (isEven(num1)) {
			System.out.println(num1 + " is an even number");
		} else {
			System.out.println(num1 + " is an odd number");
		}
	}

}
