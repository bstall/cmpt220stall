import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String message = input.nextLine();
		
		//Display length and first character
		System.out.println("The length of " + message + " is "
				+ message.length());
		System.out.println("This first character of " + message + " is "
				+ message.charAt(0));

	}

}
