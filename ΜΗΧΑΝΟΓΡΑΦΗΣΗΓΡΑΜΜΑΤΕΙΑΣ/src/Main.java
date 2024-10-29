
public class Main {

	public static void main(String[] args) {

	 ClassRoom room101 = new ClassRoom("Room 101", 2);

	        // Δημιουργια φοιτητων
	         Student student1 = new Student("Alice", 1001);
	         Student student2 = new Student("Bob", 1002);
	         Student student3 = new Student("Charlie", 1003);

	        // Δημιουργια Μαθηματος
	        Course math = new Course("Mathematics", room101);

	        // Προσθήκη Φοιτητων στο Μαθημα
	         math.addStudent(student1);
	          math.addStudent(student2);
	         math.addStudent(student3); // Θα αποτύχει λόγω χωρητικότητας

	        // Δημιουργηα Γραμματειας
	         Registry registry = new Registry("Computer Science Department");

	        // Προσθηκη Μαθηματος στη Γραμματεια
	         registry.addCourse(math);

	        // Εκτυπωση ολων των μαθηματων στη Γραμματεια
	          registry.printAllCourses();
	    
	}

}
