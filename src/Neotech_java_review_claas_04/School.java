package Neotech_java_review_claas_04;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s=new School();
		
		Student student1=new Student();
		student1.name="Biden";
		student1.studentNr=46;
		student1.gradeLevel=5;
		
		
		
		
		
		
		Student student2=new Student();
		student2.name="Trump";
		student2.studentNr=47;
		student2.gradeLevel=4;
		
		Teacher teacher= new Teacher();
		teacher.name="mercedes";
		teacher.salary=120000;
		teacher.subject="Java";
		//Re - assigning value
		teacher.subject="ELA";
		
		System.out.println(" Lets call the method");
		
		student2.study();
		
		student1.sleep();
		student2.sleep();
		
		teacher.teach();
		teacher.yellAtStudent();
		
		//also to name specific
		teacher.yellAtStudentWithName("Bahar");
		
		
				
	}

}
