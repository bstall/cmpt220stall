import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// Problem 2.1
		Scanner input = new Scanner(System.in);
		//Enter Celsius
		System.out.println("Enter a Celsius degree as a double: ");
		double celsius = input.nextDouble(); 
		//Convert from Celsius to Fahrenheit
		double fahrenheit = ((9.0/5) * celsius + 32);
		//Displays Fahrenheit
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	}

}
