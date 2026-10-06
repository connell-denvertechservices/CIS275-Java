
public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//reversing a string
		String word = "programming";
		String reversed = ""; 
		
		for (int i = word.length()-1; i>=0; i--) {
			reversed = reversed + word.charAt(i);
		}
		System.out.println(reversed);
	}

}
