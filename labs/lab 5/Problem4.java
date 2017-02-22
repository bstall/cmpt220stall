import java.util.Scanner;

public class Problem4 {
	//Problem 7.19
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get list from user
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		// Displays whether the list is sorted 
		System.out.println(
			"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

	//Returns true if list is sorted, false if not.
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}

}
