import java.util.*;

public class Problem2 {
	//12.3
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Invoke getArray method
		int[] array = getArray();

		//Get index of array from user
		System.out.print("Enter the index of the array: ");
		try {
			//Display element value
			System.out.println("The corresponding element value is " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	//Returns array with 100 random integers 
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}

}
