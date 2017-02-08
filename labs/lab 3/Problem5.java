import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		//Problem 6.3
		Scanner input = new Scanner(System.in);
		// Create a Scanner

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");
	}

	//Is palindrome if true
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	//Returns reversal of integers
	public static int reverse(int number) {
		String reverse = ""; 	
		// Holds reversed number
		String n = number + ""; 
		// Convert number to string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); 
		// Return reversed integer
	}


	

}
