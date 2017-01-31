import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		//Generating random integers
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 6 % 10);
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Get user answer
		System.out.print(
				"What is " + number1 + " + " + number2 + " + " + number3 +"? ");
		int answer = input.nextInt();
		
		//Check user answer
		System.out.println(
				number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
		        (number1 + number2 + number3 == answer));
	}
}
