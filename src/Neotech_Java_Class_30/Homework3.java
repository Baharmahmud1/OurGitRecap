package Neotech_Java_Class_30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// colllection 
public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Student> students = new HashSet<>();
		
		Student s1 = new Student("Cem",1);
		
		students.add(s1);
		students.add(new Student("Halil",1));
		students.add(new Student("Ozzy",1));
		students.add(new Student("Alisan",1));
		
		for(Student student:students) {
		System.out.println(student.getStudentID() + " ---------->" + student.getName());
	}
System.out.println("---------------------");

Iterator<Student> it = students.iterator();
while (it.hasNext()) {
	Student currentStudent = it.next();
	System.out.println(currentStudent.getStudentID() + " ---------->" + currentStudent.getName());
	
}
}

}

class Student{
	
	private String name;
	private int studentID;
	
	public Student (String name, int studentID) {
	this.name =name;
	this.studentID=studentID;
	
}

public String getName() {
	
	return this.name;
	
}

public String getStudentID() {
	
	return this.getStudentID();
	
	
}

public void setname(String name) {
	this.name = name;
	
}

}