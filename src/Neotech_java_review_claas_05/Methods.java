package Neotech_java_review_claas_05;

public class Methods {
	
	 void printWelcomeFiveTimes() {
		 for (int i = 1; i <= 5; i++) {
			 System.out.print("Welcome |");
			
		}
		 
		 System.out.println();
		
	}

	  void printWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			 System.out.print("Welcome |");
		}
		System.out.println();
	}
	 
	  void printGreetingFiveTimes(String greeting) {
			for (int i = 1; i <= 5; i++) {
				 System.out.print(greeting + " | ");
			}
			System.out.println();
		}
	  
	  void printGreetingWithNumbers(String greeting, int n) {
			for (int i = 1; i <= n; i++) {
				 System.out.print(greeting + " | ");
			}
			System.out.println();
		}
	  
	 public static void main(String[] args) {
		Methods m= new Methods();
		m.printWelcomeFiveTimes();
		
		m.printWelcomeWithNumber(7);
		m.printGreetingFiveTimes("Bonjour");
		m.printGreetingFiveTimes("Marhaba");
		m.printGreetingWithNumbers("Holla",7);
	}
}
