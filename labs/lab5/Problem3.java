import java.util.Scanner;

public class Problem3 {
	//Problem 7.14
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int[] numbers = new int[5]; // Create an array
		
		//Get 5 numbers from user
		System.out.print("Enter five numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		// Display the greatest common divisor
		System.out.println("The greatest common divisor is " + gcd(numbers));
	}

	//Returns gcd 
	public static int gcd(int... numbers) {
		int gcd = 1;			
		boolean isDivisor;	

		for (int i = 2; i < min(numbers); i++) {
			isDivisor = true;
			for (int e: numbers) {
				if (e % i != 0)
					isDivisor = false;
			}
			if (isDivisor)
				gcd = i;
		}
		return gcd;
	}

	//Returns smallest integer of array
	public static int min(int... numbers) {
		int min = numbers[0];
		for (int e: numbers) {
			if (e < min)
				min = e;
		}
		return min;
	}

}
