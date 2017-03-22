
public class Problem3 {
	//10.9
	public static void main(String[] args) {
		// Create a course
		Course hist101 = new Course("hist101");

		// Add three students
		hist101.addStudent("John");
		hist101.addStudent("Ally");
		hist101.addStudent("Beth");

		//Removes a student
		hist101.dropStudent("John");

		// Displays students in course
		System.out.println("\nThe students in the course " + 
			hist101.getCourseName() + ":");
		String[] students = hist101.getStudents();
		for (int i = 0; i < hist101.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}

}
