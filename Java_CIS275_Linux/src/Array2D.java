
public class Array2D {

	public static void main(String[] args) {
		// sum each row, sum each column 
		double[][] matrix = { 
				{1.5,2,3,4.5},
				{5.5,6.3,7.2,8},
				{9.5,1.0,3.0,1.0}
		};
		
		double sumRow=0, sumCol=0; 
		System.out.println(matrix.length); //row count
		System.out.println(matrix[0].length); //count of columns in row 0
		
		for (int i = 0; i < matrix.length; i++) {
			for (j=0; j < matrix[i].length;j++) {
				sumRow = sumRow + matrix[i][j];
			} //end inner for
			System.out.println("The sum of values in row " + i + " is " + sumRow);
			sumRow = 0;
		} //end outer for
		//now sum the columns
		int i, j;
		for (i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sumCol = sumCol + matrix[j][i];
			}
			System.out.println("i:" + i);
			System.out.println("j:" + j);
			System.out.println("The sum of values in " + i + " is " + sumCol);
			sumCol = 0;
		}
		
		
	}

}
