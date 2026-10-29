
public class ArrayReverse {
	public static int[] reverseArray(int[] arr) {
		int[] reverse = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i>=0;i--) { 
			reverse[j] = arr[i];
			j = j + 1;
		}
		return reverse;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] reversed = reverseArray(arr);
		
		for (int i = 0; reversed.length;i++) {
			System.out.println(reversed[i]);
		}
		
	}
}
