import java.io.*;
import java.util.*;

public class Problem5 {
	//12.11
	
	public static void main(String[] args) throws Exception {
		//Check command line parameter usage
		if (args.length != 2) {
			System.out.println("Remove text: filename ");
			System.exit(1);
		}

		//Check if file exists
		File file = new File(args[1]);
		if (!file.exists()) {
			System.out.println("File " + args[1] + " does not exist");
			System.exit(2);
		}

		//Create ArrayList
		ArrayList<String> s2 = new ArrayList<>(); 
		try (
			//Create input file
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				s2.add(removeString(args[0], s1));
			}
		}

		try (
			//Create output file
			PrintWriter output = new PrintWriter(file);
		) {
			for (int i = 0; i < s2.size(); i++) {
				output.println(s2.get(i));
			}
		}
	}

	public static String removeString(String string, String line) {
		StringBuilder stringBuilder = new StringBuilder(line);
		 //Start index
		int start = stringBuilder.indexOf(string);
		//End index
		int end = string.length(); 

		while (start >= 0) {
			end = start + end;
			stringBuilder = stringBuilder.delete(start, end);
			start = stringBuilder.indexOf(string, start); 
		}

		return stringBuilder.toString();
	}
}

