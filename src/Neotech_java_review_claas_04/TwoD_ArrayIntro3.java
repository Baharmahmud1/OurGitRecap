package Neotech_java_review_claas_04;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums= {
				{8,5},
				{9,1,6,2},
				{7}
				};
		
		System.out.println(nums[1][2]);//6
		System.out.println(nums[2][0]);//7
		//System.out.println(nums[0][2]);//run time error
		
		System.out.println("---------------------------------------");
		
		System.out.println("The number of arrays ---> "+ nums.length);
		System.out.println("The legth of row with index[1] ---> "+nums[1].length);
		System.out.println("The legth of row with index[1] ---> "+nums[0].length);
		System.out.println("The legth of row with index[1] ---> "+nums[2].length);
		
		System.out.println("---------------------------------------");
		
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
