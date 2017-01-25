import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		//Problem 2.6
		//Read number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		//Extract the digits
		int onesNumber = number % 10;
		int number2 = number / 10;
		int tensNumber = number2 % 10;
		int number3 = number2 / 10;
		int hundredsNumber = number3;
		//Calculations
		int sum = onesNumber + tensNumber + hundredsNumber;
		//Display
		System.out.println("The sum of the digits is " + sum);

	}

}
