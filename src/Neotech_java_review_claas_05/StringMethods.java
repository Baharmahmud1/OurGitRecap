package Neotech_java_review_claas_05;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Pershendtje";
		System.out.println(str.length());
		System.out.println(  str.isEmpty());
		System.out.println(  str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(  str.isEmpty());
		System.out.println(  str.toLowerCase());
		
		boolean equals=str.equals("PERSHENDTJE");
		System.out.println(  "Equals--->" + equals);
		System.out.println( "Equals ignore cases--? "+str.equalsIgnoreCase("PERSHENDTJE"));
		System.out.println( "------------------------------------------------");
		
	
		System.out.println(  str.contains("e"));
		System.out.println(str.contains("sh"));
		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));
		
		
		System.out.println(str.startsWith("Per"));
		boolean start=str.startsWith("Per");
		System.out.println(start);	
		
		boolean start1=str.startsWith("per");
		System.out.println(start1);
		
		boolean start2=str.startsWith("per");
		System.out.println(start2);
		
		System.out.println(str.startsWith("Pershendtje"));
		
		
		System.out.println(str.endsWith("e"));
		
		System.out.println(str.endsWith("E"));//case sensitivity
		
		System.out.println("---------------------------------------------");
		
		String name="Karem" + "+" + "Unal";
		System.out.println(name);
		
		String name2="Karem".concat("+" ).concat("Unal");//method chaining
		System.out.println(name2);
		
		String name3="Karem".toUpperCase() .concat("+" ).concat("Unal");//method chaining
		System.out.println(name3);
		
		//String name4="Karem".length().concat("Unal");//can not concat with int
	//	System.out.println(name3);
		
		int name4="Karem".concat("Unal").length();//method chaining
		System.out.println(name4);
		
				
		
		System.out.println("---------------------------------------------");
		
		String str2="    Burak found the answer        ";
		System.out.println(str2.trim());
		System.out.println(str2.length());
		System.out.println(str2.trim().length());
		
		System.out.println("---------------------------------------------");
		
		String str3= " Maya is very happy";
		
		char letter=str3.charAt(7);
		System.out.println(letter);
		
		int index = str3.indexOf("v");
		System.out.println(index);
		
		int index1 = str3.indexOf("a");
		System.out.println(index1);// find the first one
		
		int index2 = str3.indexOf("a", 8);// start looking after index 8
		System.out.println(index2);


		
		System.out.println(str3.indexOf('X'));
		
		
		
		
		
		
		
		
		
		
	}

}
