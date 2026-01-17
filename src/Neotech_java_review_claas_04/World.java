package Neotech_java_review_claas_04;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a =5;
		Baby baby1= new Baby();
		baby1.name= "Burak";
		
		baby1.wieght=7;
		
		
		 System.out.println(" the name of the baby1: " + baby1.name);
		 System.out.println(" the Haircolor of the baby1: " + baby1.hairColor);
		 
		 baby1.hairColor="Brown";
		 baby1.gender= 'M';
		 
		 System.out.println(" the Haircolor of the baby1: " + baby1.hairColor);
		 
		//Method implementation
		baby1.cry();
		baby1.drink();
		baby1.talk();
		
		System.out.println("---------------------------------------------------------------------");
		
		//Baby baby2=new Baby(); 
		//or
		
		Baby baby2;
		 baby2=new Baby();
		 baby2.name="Ylli";
		 baby2.hairColor="Yellow";
		 baby2.gender='M';
		 baby2.wieght=9;
		 
		 System.out.println(" the Haircolor of the baby1: " + baby1.hairColor);
		 System.out.println(" the Haircolor of the baby2: " + baby2.hairColor);
		 
		 System.out.println("---------------------------------------------------------------------");	 
		
		baby1.cry();
		baby2.cry();
		
		baby1.talk();
		
		System.out.println("---------------------------------------------------------------------");	 
		
		baby1.displayInformation();
		
		System.out.println("---------------------------------------------------------------------");
		
		baby2.displayInformation();
		
	}

}
