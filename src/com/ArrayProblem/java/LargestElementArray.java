package com.ArrayProblem.java;
/**
 * 
 * @author Kapil
 *
 */

public class LargestElementArray {
	
	//Initialize array
		static int arr[] = { 10, 467, 78, 199, 95 };

		// Method to find maximum in arr[]
		static int largest() {
			int i;

			// Initilize maximum element
			int max = arr[0];

			/**
			 *  Traverse array element from second and
			 *  compare every element with current max
			 */
			for (i = 1; i < arr.length; i++)    //for loop traversal
				if (arr[i] > max)       //Checking condition
					max = arr[i];
			return max;
		}

		public static void main(String[] args) {
			System.out.println("Largest in given array is " + largest());    // printing large number 

		}

}
