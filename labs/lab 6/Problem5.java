import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		//Problem 9.13

	}
}

class Location {
	// Data 
	int row;         	
	int column;			
	double maxValue;	

	// Constructs a default Location object 
	Location(double[][] a) {
		maxValue = a[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
			// Create a Scanner object
			Scanner input = new Scanner(System.in);

			// Prompt the user to enter array values
			System.out.print("Enter the number of rows and columns in the array: ");
			int rows = input.nextInt();
			int columns = input.nextInt();

			// Create a matrix
			double[][] array = new double[rows][columns]; 
			System.out.println("Enter the array: ");
			for (int i1 = 0; i1 < array.length; i1++) {
				for (int j = 0; j < array[i1].length; j++) {
					array[i1][j] = input.nextDouble();
				}
			}

			// Get instance of Location
			Location max = locateLargest(array);

			// Display the location of the largest element in the array
			System.out.println("The location of the largest element is " +
				max.maxValue + " at (" + max.row + ", " + max.column + ")");
		}

	}
	//Returns an instance of Location 
	public Location locateLargest(double[][] a){
		return new Location(a);
	}
}
