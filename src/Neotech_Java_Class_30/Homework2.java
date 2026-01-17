package Neotech_Java_Class_30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// create set of cities
// insertion order maintained
//
public class Homework2 {

	public static void main(String[] args) {

		Set<String>cities = new LinkedHashSet<>();
		cities.add("Tirana");
		cities.add("London");
		cities.add("Albuquerque");
		cities.add("Amsterdom");
		cities.add("cincinnati");
		cities.add("miami");
		
		System.out.println(cities);
		
		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			String city = it.next();
			
			if(city.toUpperCase().startsWith("A")) {
				it.remove();
			}
			}
			
			System.out.println(cities);
		}

	}


