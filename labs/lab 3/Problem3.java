import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		//Problem 5.16
		Scanner input = new Scanner(System.in);
		//Ask for integer
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		//Display factors
		for(int i = 2; i<= n; i++){
			while(n%i==0){
				System.out.println(i);
				n = n/i;
			}
		}

	}

}
