import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// Scanner
		char ch;
		Scanner scan = new Scanner(System.in);
		
		//Get input
		System.out.print("Enter a letter: ");
		
		//Vowels
		 if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
			        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
			        ch=='u' || ch=='U'); // JA: This is a syntax error. You are closing the if statement with the ;
		 {
			 System.out.println("This is a vowel.");
		 }
		 //Invalid characters
		 // JA: The else statement will be invalid because the if was already closed
		 else if(ch=='!' || ch=='@' || ch=='#' || ch=='$' ||
				 ch=='%' || ch=='^' || ch=='&' || ch=='*' ||
				 ch=='(' || ch==')' || ch=='-' || ch=='=' ||
				 ch=='+' || ch=='_' || ch=='?' || ch=='.' ||
				 ch==',' || ch=='>' || ch=='<' || ch=='~' ||
				 ch=='`'); // JA: This is a syntax error. You are closing the if statement with the ;
		 {
			 System.out.println("This is an invalid character.");
		 }
		 //Consonants
		 else {
			 System.out.println("This is a consonant.");
		 }
	}

}
