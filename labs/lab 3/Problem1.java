import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		//Problem 5.1
		Scanner input = new Scanner(System.in);
		//Initialize variable
		int x;
		int total = 0;
		int count = 0;
		int positive = 0;
		int negative = 0;
		//Ask user for integers
		System.out.println("Enter an integer, the input ends if it is 0: ");
		//Loop to stop at 0
		while((x = input.nextInt()) !=0){
			total += x;
			count++;
			if(x>0){
				positive++;
			}
			else{
				negative++;
			}
		}
		//Make average a possible decimal
		float average = total / (float)count;
		//Display
		System.out.println("Number of positives: " + positive);
		System.out.println("Number of negatives: " + negative);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);

	}

}
