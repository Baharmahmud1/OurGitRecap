package Neotech_java_review_claas_04;

public class Teacher {

	String subject;
	String name;
	double salary;
	
	 void teach() {
		System.out.println(name + " is teaching " + subject);
		
	}
	
	
	void yellAtStudent() {
		System.out.println(name + " is yelling");
	}
	//also can be done to student specific
	void yellAtStudentWithName(String studentName) {
		System.out.println(name + " is yelling to " + studentName);
	}
}
