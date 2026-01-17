package Neotech_java_review_claas_05;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String longStr=" I am very happy today because today is not Monday";
		String[] strArray=longStr.split("today");
		System.out.println(strArray.length);
		for (String element : strArray) {
			System.out.println(element);
			
		}
		
		
		for (int i = 0; i <= strArray.length; i++) {
		System.out.println(strArray[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		longStr="I like number 5 and 6 because 7 ate 9";
		
		String[] stringArray=longStr.split("[5-7]");
		System.out.println(stringArray.length);
		
		for (String str : stringArray) {
			System.out.println(str)
		}
	}

}
