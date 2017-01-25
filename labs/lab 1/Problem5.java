import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		//Problem 2.9
		Scanner input = new Scanner(System.in);
		//Starting velocity
		System.out.println("Enter starting velocity in meters per second: ");
		double v0 = input.nextDouble();
		//Ending velocity
		System.out.println("Enter ending velocity in meters per second: ");
		double v1 = input.nextDouble();
		//Time span
		System.out.println("Enter the time span in seconds: ");
		double t = input.nextDouble();
		//Calculate
		double acceleration = ((v1 - v0) / t);
		//Display
		System.out.println("The average acceleration is " + acceleration);

	}

}
