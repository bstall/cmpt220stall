import java.util.Scanner;
import java.util.ArrayList;

public class Problem4 {
	//Problem 11.11
	public static void main(String[] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Create array list of integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		//Get 5 numbers from user
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		//Sort 
		sort(list);

		//Display in increasing order
		System.out.println(list.toString());
	}

	//Sorts array list
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}

}
