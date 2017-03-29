import java.util.Scanner;
import java.util.ArrayList;

public class Problem5 {
	//Problem 11.13
	public static void main(String[] args) {
		
		// Create a scanner
		Scanner input = new Scanner(System.in);

		//Create an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		//Get 10 integers from user
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}

		//Invoke removeDuplicate method
		removeDuplicate(list);

		//Displays distinct integers
		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	//Removes duplicates from list
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}

}
