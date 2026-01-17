package Neotech_java_review_claas_04;

public class Baby {

	String name;
	char gender;
	int wieght;
	String hairColor;
	
	 void talk() {
		// TODO Auto-generated method stub
		  System.out.println(name + " is talking"); 
	}
	 
	  void drink() {
		  System.out.println(name + " is drinking"); 
	}
	  
	  void cry() {
		
		  System.out.println(name + " is crying"); 
	}
	  
	  void displayInformation() {
		
		  System.out.println("My name is " + name);
		  System.out.println("My gender is " + gender);
		  System.out.println("My haircolor is " + hairColor);
		  System.out.println("My wieght is " + wieght);
	}
	
}
