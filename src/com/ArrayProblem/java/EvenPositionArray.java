package com.ArrayProblem.java;
/**
 * 
 * @author Kapil
 *
 */
public class EvenPositionArray {
	
	public static void main(String[] args) {
		        //Declare and Initialize an array
				int[]arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
				
				//print
				System.out.println("Element of given array present on even position:");

			   //Loop through the array by incrementing value of i by 2
		       //Here, i will start from 1 as first even positioned element is present at position 1

			    	for(int i = 1; i<arr.length; i= i+2) {
					System.out.println(arr[i]);  //print arr[i]
		
		}
		
	}
	
}
