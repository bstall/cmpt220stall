import java.util.Scanner;

public class WithException {
	//Calculator with exception, problem 12.1
	public static void main(String[] args) throws NumberFormatException {
		//Check number of strings passed
		if (args.length != 3) {
			Scanner scan = new Scanner(System.in);
			System.out.println(
				"Java Calculator: ");
			String s = scan.next();
			int result = scan.nextInt();
			System.exit(0);
		}

		//The result of the operation
		int result = 0;

		//Exception handler to deal with non-numeric operators
		try {
			// Determine the operator
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
		catch (NumberFormatException ex) {
			System.out.println("Wrong Input: " + 
				ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1, 
					ex.getMessage().lastIndexOf("\"")));
		}
	}

}
