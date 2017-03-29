
public class Problem3 {
	//Problem 11.5
	public static void main(String[] args) {
		//Create Course objects
		Course course1 = new Course("Wizardry 100");
		Course course2 = new Course("Songwriting 101");
		
		//Add students to course1
		course1.addStudent("Emma Watson");
		course1.addStudent("Daniel Radcliffe");
		course1.addStudent("Rupert Grint");

		//Add students to course2
		course2.addStudent("Ed Sheeran");
		course2.addStudent("Taylor Swift");

		//Display course1
		System.out.println("Number of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + " ");

		//Display course2
		System.out.println();
		System.out.print("Number of students in course2: "
			+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + " ");
	}

}
