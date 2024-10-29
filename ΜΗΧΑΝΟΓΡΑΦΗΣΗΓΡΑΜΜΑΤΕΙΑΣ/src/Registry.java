import java.util.ArrayList;
import java.util.List;

public class Registry {

	 private String name;
	     private List<Course> courses;

	
	     public Registry(String name) {
	          this.name = name;
	          this.courses = new ArrayList<>();
	    }

	   
	    public void addCourse(Course course) {
	        courses.add(course);
	          System.out.println("Course " + course.getName() + "  added to Registry.");
	    }

	    
	    public void printAllCourses() {
	         System.out.println("Courses in registry " + name + ":");
	         for (Course course : courses) {
	             System.out.println("Course: " + course.getName());
	             course.printClassRoom();
	              course.printEnrolledStudent();
	        }
	    }
}
