
public class Octagon extends GeometricObject {
	implements Cloneable, Comparable<Octagon> {
		private double side;

		public Octagon() {
		}

		//Construct a Octagon of specified side
		public Octagon(double side) {
			this.side = side;
		}

		//Set new specified side 
		public void setSide(double side) {
			this.side = side;
		}

		//Return side 
		public double getSide() {
			return side;
		}

		@Override //Return area
		public double getArea() {
			return (2 + 4 / Math.sqrt(2)) * side * side;
		}

		@Override //Return perimeter 
		public double getPerimeter() {
			return 8 * side;
		}

		@Override //Implement compareTo 
		public int compareTo(Octagon o) {
			if (getArea() > o.getArea())
				return 1;
			else if (getArea() < o.getArea())
				return -1;
			else
				return 0;
		}

		@Override //Override the protected clone and strengthen accessibility
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		@Override //Return String description of Octagon 
		public String toString() {
			return super.toString() + "\nArea: " + getArea() + 
				"\nPerimeter: " + getPerimeter();
		}

}
