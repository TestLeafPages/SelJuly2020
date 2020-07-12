package week1.day2;

import java.util.Arrays;

public class LearnArray {
	
	
	public int arraySize() {
		
		return 3;

	}
	

	public static void main(String[] args) {
		
	//	LearnArray la = new LearnArray();
		//int arraySize = la.arraySize();

		//int[] num1 = { 10, 20, 30 };

		int[] num = new int[5];

		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 15;
		num[4] = 25;
		
		
		Arrays.sort(num);
		
		
		for (int i = num.length-1; i >= 0; i--) {
			
			System.out.println(num[i]);
			
		}
		
		
		/*
		 * for (int i : num) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
		
		
		/*
		 * for( int eachVal : num) { System.out.println(eachVal); }
		 */
		
		/*
		 * for (int temp : num) {
		 * 
		 * System.out.println(temp);
		 * 
		 * }
		 */
		//int len = num.length;

		/*
		 * System.out.println(len);
		 * 
		 * System.out.println(num[len-1]);
		 */

		/*
		 * for (int i = len - 1; i >= 0; i--) {
		 * 
		 * System.out.println(num[i]);
		 * 
		 * }
		 */
		/*
		 * for (int i = 0 ; i < num.length; i++) {
		 * 
		 * System.out.println(num[i]);
		 * 
		 * }
		 */

		/*
		 * System.out.println(num.length);
		 * 
		 * System.out.println(num[num.length-1]);
		 */

	}

}
