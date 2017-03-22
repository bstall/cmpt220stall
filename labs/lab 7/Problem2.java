import java.util.Scanner; 

public class Problem2 {
	public static void main(String[] args) {
			// Create  Scanner
			Scanner input = new Scanner(System.in);

			//Get positive integer from user
			System.out.print("Enter a positive integer: ");
			int number = input.nextInt();

			//Displays smallest factors in decreasing order
			System.out.print("The smallest factors of " + number + " are: ");
			StackOfIntegers stack = new StackOfIntegers(); 

			smallestFactors(number, stack);

			while (!stack.empty()) {
				System.out.print(stack.pop() + " ");
			}
			System.out.println();
		}

		//Find factors and push to stack
		public static void smallestFactors(int number, StackOfIntegers stack) {
			int i = 2; //Could be prime
			while (number / i != 1){ 
				if (number % i == 0) {
					stack.push(i);
					number /= i;
				}
				else
					i++;
			}
			stack.push(number);
		}

}
