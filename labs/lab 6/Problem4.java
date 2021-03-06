import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		//Problem 9.11
		
		class LinearEquation {
			// Data 
			private double a;
			private double b;
			private double c;
			private double d;
			private double e;
			private double f;

			// Constructor with arguments 
			LinearEquation(double a, double b, double c, double d, double e, double f) {
				this.a = a;
				this.b = b;
				this.c = c;
				this.d = d;
				this.e = e;
				this.f = f;
			}

			// Return a 
			public double getA() {
				return a;
			}

			// Return b 
			public double getB() {
				return b;
			}

			// Return c 
			public double getC() {
				return c;
			}

			// Return d 
			public double getD() {
				return d;
			}

			// Return e 
			public double getE() {
				return e;
			}

			// Return f 
			public double getf() {
				return f;
			}

			// Returns true if ad - bc is not 0 
			public boolean isSolvable() {
				return a * d - b * c != 0;
			}

			// Returns x 
			public double getX() {
				return (e * d - b * f) / (a * d - b * c);
			}

			// Returns y 
			public double getY() {
				return (a * f - e * c) / (a * d - b * c);
			}
		}
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		
		// Prompt the user to enter values
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		// Create a LinearEquation object
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		{
		// Display 
		if (linearEquation.isSolvable()) {
			System.out.println("x is " + linearEquation.getX() +
				" and y is " + linearEquation.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}
	}

}
