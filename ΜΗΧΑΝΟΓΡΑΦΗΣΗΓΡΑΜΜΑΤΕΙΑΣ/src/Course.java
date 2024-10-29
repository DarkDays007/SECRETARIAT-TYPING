import java.util.ArrayList;

public class Course {

	
	 private String name;
	 
	 private ArrayList<Student>enrolledStudents;
	 
	 private ClassRoom myClassRoom;
	
	 public Course (String name,ClassRoom myClassRoom) {
		 
	  	 this.name=name;
	  	 
		 this.myClassRoom=myClassRoom;
		 
		 this.enrolledStudents=new ArrayList<>();
	 }
	

	
	 public String getName() {
		 
		return name;
	}



	public void setName(String name) {
		  this.name = name;
	}



	public ArrayList<Student> getEnrolledStudents() {
	     	return enrolledStudents;
	}



	public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
		 this.enrolledStudents = enrolledStudents;
	}



	public ClassRoom getMyClassRoom() {
		  return myClassRoom;
	}



	public void setMyClassRoom(ClassRoom myClassRoom) {
		 this.myClassRoom = myClassRoom;
	}



	public boolean addStudent(Student student) {
	         if (enrolledStudents.size() < myClassRoom.getCapacity()) {
	              enrolledStudents.add(student);
	              System.out.println(student.getName() + " enrolled in " + name);
	               return true;
	        } else {
	            System.out.println("Enrollment failed: ClassRoom capacity reached.");
	            return false;
	        }
	    }
	
	 
	
	 public void printEnrolledStudent() {
		 System.out.println("Students enrolled in " + name + ":");
		 for(Student stud:enrolledStudents) {
			 stud.printInfo();
			 
		 }
	 }
	 
	
	    public void setClassRoom(ClassRoom newClassRoom) {
	        this.myClassRoom = newClassRoom;
	    }
	    
	    public void printClassRoom() {
	        System.out.println("ClassRoom for " + name + ": " + myClassRoom.getLocation());
	    }
	    
	    
	    
	    
	}

