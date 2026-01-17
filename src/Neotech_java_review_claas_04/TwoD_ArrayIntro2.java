package Neotech_java_review_claas_04;

import java.util.Arrays;
import java.util.Iterator;

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] nums= { 
				{3,6,1},
				{2,7,0},
				{8,2,9},
				{1,4,5}   
		};
		
		System.out.println(nums[1][2]);// num=0
		System.out.println(nums[0][2]);//num=8
		
		System.out.println("---------------------");
		
		for (int[] row : nums) {
			for (int element : row) {
				System.out.print(element + "  ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		//how to 1D array from index 1
		
		int[] row1=nums[1];
		System.out.println(Arrays.toString(row1));
		
		System.out.println("---------------------");
		
		//how to 1D arraay {1,4,5}  
		int[] row3=nums[3];
		System.out.println(Arrays.toString(row3));
		
		System.out.println("---------------------");
		
		for (int[] row : nums) {
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + " ");
			}
			
			System.out.println();
		}
	}

}
