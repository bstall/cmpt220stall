
public class Triangle 
				extends GeometricObject {
		private double side1;
		private double side2;
		private double side3;
				
		//Create a default object
		Triangle() {
			side1 = side2 = side3 = 1.0;
		}

		//Construct a triangle with specified sides
		Triangle(double side1, double side2, double side3) { 
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}

		//Return sides
		public double getSide1() {
			return side1;
		}

		public double getSide2() {
			return side2;
		}

		public double getSide3() {
			return side3;
		}

		//Return area
		public double getArea() {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}

		//Return perimeter
		public double getPerimeter() {
			return side1 + side2 + side3;
		}

		//Return string description
		public String toString() {
			return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
		}
				

}
