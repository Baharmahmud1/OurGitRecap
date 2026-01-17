package Neotech_java_review_claas_04;

import java.io.Closeable;
import java.util.Scanner;

public class Scanner_2DArray {

	//ask user how many rows
	//ask user how many columns
	
	
	
			
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println(" how many rows u want?");
		int rows=input.nextInt();
		System.out.println(" how many columns u want?");
		int cols= input.nextInt();
		
		//create the array (String[][] names)
		
		String[][] names= new String [rows][cols];
		
		//Fill the array
		
	for (int row= 0; row<rows; row++) {
		for (int col = 0; col< cols; col++) {
			System.out.println("Please enter your name: ");
			 names[row][col]=input.next();
		}
		
	}
		
		
		//Print the array
	
	for (String[] row : names) {
		for (String name : row) {
			System.out.println(name +" ");
		}
		 System.out.println();
	}
	
		
	}

}
