package Neotech_java_review_claas_05;

public class TestBora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bora b=new Bora();
		b.addAnyNumbers();
		
		b.addMyNumbers(6, 7);
		
		b.addAnyNumbersAndGiveTheResult();
		
		int res=b.addAnyNumbersAndGiveTheResult();
		System.out.println("Thr result was-->" +res);
		
		int res2=b.addMyNumbersAndGiveTheResult(6, 7);
		System.out.println("Thr result was-->" +res2);
		
		if (res2==13) {
			System.out.println("Good job Bora!");
		}
		
		else {
			System.out.println("I still love you, try again");
		}
	}

}
