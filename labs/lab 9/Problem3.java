import java.util.Scanner;


public class Problem3 extends Triangle {
	public static void main(String[] args) throws IllegalTriangleException {
		//Create Scanner object
		Scanner input = new Scanner(System.in);

		//Get color from user
		System.out.print("Enter a color: ");
		String color = input.next();

		//Get whether is filled from user
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		boolean repeatSidesInput = true;
		do {
			//Get 3 sides from user
			System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
	
			//Create triangle object with user input
			Triangle triangle = new Triangle(side1, side2, side3);
			repeatSidesInput = false;	
			
			triangle.setColor(color);
			triangle.setFilled(filled);

			System.out.println(triangle.toString());
			System.out.println("Area: " + triangle.getArea());
			System.out.println("Perimeter: " + triangle.getPerimeter());
			System.out.println("Color: " + triangle.getColor());
			System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
				+ "filled");

		} while (repeatSidesInput);
	}

}
