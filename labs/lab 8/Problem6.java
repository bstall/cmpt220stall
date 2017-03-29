import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem6 {
	//Problem 11.17	 
	public static void main(String[] args) {
	         
		//Boolean controls program flow
	    boolean looping = true;
	    Scanner in = null;
	    do{
	    	try {                  
	            //Get user input
	            in = new Scanner(System.in);
	            System.out.println("Enter an integer m: ");
	            int m = in.nextInt();
	            if(m < 1) {
	            	throw new InputMismatchException();
	            }
	                               
	    //Call methods and print result
	    System.out.println("The smallest number n for m*n to be a perfect square is "+perfectSquare(m));
	    System.out.println("m*n is "+(m*perfectSquare(m)));
	    	looping = false;
	    } catch (InputMismatchException e) {
	    	System.err.println("Must enter a positive integer\n" + e);
	        }
	    } while(looping);
	 
	        }
	 
	        //Method that separates m into factors
	        private static ArrayList<Integer> factors(int m) {
	                ArrayList<Integer> list = new ArrayList<>();
	               
	                //Variables 
	                int temp = m, j = 2;
	                while (temp != 1) {
	                       
	                        //If temp is divisible, add the divisor to the list and decrement temp
	                        if (temp % j == 0) {
	                                list.add(j);
	                                temp /= j;
	                               
	                                //If it is not divisible, increment the divisor
	                        } else {
	                                j++;
	                        }
	                }
	                return list;
	        }
	 
	        //Returns n, when multiplied with m, gives a perfect square
	        static int perfectSquare(int m) {
	               
	                //Factors of m
	                ArrayList<Integer> factors = factors(m);
	               
	                //Removes even factors
	                for (int i = 0; i < factors.size() - 1; i++) {
	                        for (int j = i + 1; j < factors.size(); j++) {
	                               
	                                //If even amount of duplicates, removes both
	                                if (factors.get(i).equals(factors.get(j))) {
	                                        factors.remove(j);
	                                        factors.remove(i);
	                                       
	                                        //Reset the loop 
	                                        i=-1;
	                                        break;
	                                }
	                        }
	                }
	               
	                //Multiply all the values
	                int number = 1;
	                for (int i : factors) {
	                        number *= i;
	                }
	                return number;
	        }
	 

}
