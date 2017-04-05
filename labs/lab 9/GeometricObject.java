
public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	//Create a default 
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	//Create an object with the specified color and filled value
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	//Return color
	public String getColor() {
		return color;
	}

	//Set new color
	public void setColor(String color) {
		this.color = color;
	}

	//Return filled. Since boolean, it's method is named isFilled
	public boolean isFilled() {
		return filled;
	}

	//Set new filled 
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//Get dateCreated
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	//Return string representation
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}


}
