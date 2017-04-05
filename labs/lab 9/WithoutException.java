import java.util.Scanner;

public class WithoutException {
	//Calculator without exception, problem 12.1
	public static void main(String[] args) throws Exception {
		//Check number of strings passed
		if (args.length != 3) {
			Scanner scan = new Scanner(System.in);
			System.out.println(
				"Java Calculator:  ");
			int result = scan.nextInt();
			System.exit(0);
		}
		
		//Test for non-numeric operators
		testDigit(args[0]);
		testDigit(args[2]);

		//Result 
		int result = 0;

		//Determine operator
		switch (args[1].charAt(0)) {
			case '+' : result = Integer.parseInt(args[0]) +
									  Integer.parseInt(args[2]);
						  break;
			case '-' : result = Integer.parseInt(args[0]) -
									  Integer.parseInt(args[2]);
						  break;
			case '.' : result = Integer.parseInt(args[0]) *
									  Integer.parseInt(args[2]);
						  break;
			case '/' : result = Integer.parseInt(args[0]) /
									  Integer.parseInt(args[2]);
						  break;
		}

		//Display 
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			+ " = " + result);
	}

	//Deals with non-numeric operators
	private static void testDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				System.out.println("Wrong Input: " + str);
				System.exit(0);
			}
		}
	}

}
