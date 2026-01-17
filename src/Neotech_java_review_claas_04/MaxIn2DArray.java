package Neotech_java_review_claas_04;

import java.util.Iterator;

public class MaxIn2DArray {

	//Find the biggest number in 2D array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b= {
				{-3,4,6},
				{3,5,8},
				{9,2,-6},
				{4,12,1}
				};
		
		int biggest=b[0][0];
		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				int element=b[row][col];
				if (element>biggest) {
					biggest=element;
				}
				
			}
			
			
		}
		
		System.out.println("The biggest number is ----> "+biggest);
		
		System.out.println("---------------------------------------");
		
		//Using for each loop
		
		int max=b[0][0];
		
		for (int[] row : b) {
			for (int element : row) {
				if (element>max) {
					max=element;
					
				}
				
			}
		
		}
		System.out.println("The biggest number is ---->" + max);
		System.out.println("---------------------------------------");
	}

}
