package Neotech_Java_Class_30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework {

	public static void main(String[] args) {
		// collection countries
		// sort alphebitical order
		
		Set<String> countries = new TreeSet<>();
		
		countries.add("USA");
		countries.add("China");
		countries.add("Russia");
		countries.add("Brazil");
		
System.out.println(countries);


for(String country: countries) {
	System.out.println(country);
	
}

Iterator<String> it = countries.iterator();
while (it.hasNext()) {
	String country = it.next();
	
	
}

	}

}
