
public class Problem1 {

	public static void main(String[] args) {
		//Problem 9.1
		// Define the Rectangle class
		class Rectangle {
			double width;	// Width 
			double height;	// Height 

			//Constructor that creates a default rectangle 
			Rectangle() {
				width = 1;
				height = 1;
			} 

			//Constructor that creates a rectangle with the specified width and height
			Rectangle(double newWidth, double newHeight) {
				width = newWidth;
				height = newHeight;
			}

			// Return the area of this rectangle 
			double getArea() {
				return width * height; 
			}

			// Return the perimeter of this rectangle 
			double getPerimeter() {
				return 2 * (width + height);
			}
		}
			// Create a Rectangle with width 4 and height 40
			Rectangle rectangle1 = new Rectangle(4, 40);

			// Create a Rectangle with width 3.5 and height 35.9
			Rectangle rectangle2 = new Rectangle(3.5, 35.9);

			// Display attributes of rectangle1
			System.out.println("\n Rectangle 1");
			System.out.println("-------------");
			System.out.println("Width:     " + rectangle1.width);
			System.out.println("Height:    " + rectangle1.height);
			System.out.println("Area:      " + rectangle1.getArea());
			System.out.println("Perimeter: " + rectangle1.getPerimeter());

			// Display attributes of rectangle2
			System.out.println("\n Rectangle 2");
			System.out.println("-------------");
			System.out.println("Width:     " + rectangle2.width);
			System.out.println("Height:    " + rectangle2.height);
			System.out.println("Area:      " + rectangle2.getArea());
			System.out.println("Perimeter: " + rectangle2.getPerimeter());
		}

	}		

	
