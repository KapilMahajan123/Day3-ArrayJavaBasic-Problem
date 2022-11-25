package com.ArrayProblem.java;
/**
 * 
 * @author Kapil
 *
 */

public class SmallestElementArray {
	
	     static int[] arr = {10, 467, 78, 199, 95}; //array declaration

	         static int smallest()           //integer return type method
	         {   
	         int min = arr[0];                 // fixing the value of array at index 0
	             for(int i = 1; i < arr.length; i++)      // for loop for traversal

	          if(arr[i] < min)                  //comparing condition 

	          min = arr[i];
              return min;
     }
	 public static void main(String[] args){

	System.out.println("smallest in given array is : " + smallest());          // priniting smallest number
	}

}
