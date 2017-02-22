
public class Problem8 {
	//Problem 8.10
	public static void main(String[] args) {
		// Create a 4-by-4 matrix
		int[][] matrix = new int[4][4];
 
 		// Fills matrix randomly
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}

		// Displays the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		
		// Display the first row and column with the most 1s
		System.out.println("The largest row index: " + largestRow(matrix));
		System.out.println("The largest row column: " + largestColumn(matrix));

	}

	//Finds first row with most 1s
	public static int largestRow(int[][] m) {
		int maxRowIndex = 0;
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxRowIndex = i;
			}
		}
		return maxRowIndex;
	}

	//Finds first column with most 1s
	public static int largestColumn(int[][] m) {
		int maxColumnIndex = 0;
		int max = 0;
		for (int col = 0; col < m[0].length; col++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][col] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxColumnIndex = col;
			}
		}
		return maxColumnIndex;
	}

}
