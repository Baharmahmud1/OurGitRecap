package Neotech_java_review_claas_05;

public class MethodWithReturn {
	
	public static void main(String[] args) {
		String name="Cris";
		int numOfChars=name.length();
		System.out.println("The length of characters are; ");
		System.out.println("----------------------------------");
		
		MethodWithReturn m=new MethodWithReturn();
		boolean res=m.isOdd(8);
		System.out.println("Is 8 odd?: " + res);
		//System.out.println("Is 8 odd?: " + m.isOdd(8));
		
		boolean res2=m.isOddEnhanced(17);
		System.out.println("Is 17 odd?: " + res2);
		//System.out.println("Is 17 odd?: " + m.isOddEnhanced(17));
		
	}
	
	boolean isOddEnhanced (int num) {
		
		return num % 2==1;
	}
	
	 boolean isOdd(int num) {
		boolean result;
		
		if (num%2==1) {
			result=true;
		}
		else {
			result=false;
		}
		
		return result;
	}

}
