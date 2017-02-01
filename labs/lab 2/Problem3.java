import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		//Unicode problem
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		
		//Find Unicode value of character
		String a = input.nextLine();
		char ch = a.charAt(0); 
		
		//Display Unicode
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
		

	}

}
