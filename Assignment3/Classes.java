package Assignment3;

import java.util.ArrayList;

public class Classes {
	public static void main(String[] args) {
		
		Course course = new Course("application_engineering");
		Student student1= new Student("zehong",1);
		Student student2=new Student("holiday",2);
		course.registerStudent(student1);
		course.registerStudent(student2);	

	}


}

class Student {
	
	String name;
	int id;
	
	Student(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	
}

class Course{
	
	String courseName;
	int numberOfStudent;
	
	int courseCapacity=15;
	ArrayList<Student> registeredStudents=new ArrayList<Student>(courseCapacity);	
	
	Course(String courseName){
		this.courseName=courseName;
	}
	
	public ArrayList<Student> getStudents() {
		return registeredStudents;
		
	}
	
	public boolean isFull() {
		if (numberOfStudent>=courseCapacity)
		{return true;}
		else {
			return false;
		}
		
		
	}
	
	public void registerStudent(Student student) {
		if (!isFull()) {
			registeredStudents.add(student);
			this.numberOfStudent++;
			System.out.println(this.courseName+" is successfully registered by "+student.name);
			System.out.println("Number of students by now:" + this.numberOfStudent);	
		
			
		}
		else {
			System.out.println("Failed to register this course, it has been fully registered");
		}
		
	}
	

}


