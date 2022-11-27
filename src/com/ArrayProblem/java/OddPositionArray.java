package com.ArrayProblem.java;

/**
 * 
 * @author Kapil
 *
 */
public class OddPositionArray {
	
	public static void main(String[] args) {
 
		       //Initialize array
				int[]arr = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
				
				System.out.println("Element of given array present on odd position:");

			   //Loop through the array by incrementing value of i by 2
				for(int i = 0; i<arr.length; i= i+2) {
					System.out.println(arr[i]);
				}
		
		}
		

}
