import java.util.Scanner;

public class Problem1 {
	//Problem 11.1
	public static void main(String[] args) {
		
		// Create Scanner 
		Scanner input = new Scanner(System.in);

		//Get 3 sides from user
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		//Get color from user
		System.out.print("Enter a color: ");
		String color = input.next();

		//Get whether filled from user
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		//Create triangle with user input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}

}
