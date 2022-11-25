package com.ArrayProblem.java;

import java.util.*;

/**
 * 
 * @author Kapil
 *
 */
public class SecondLargestElementArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   //create an object 
		
		int num = scanner.nextInt();  //read the input by the user
		int a[] = new int[num];       //Declared an integer array of size input by user
		
		//To get the input of elements for every index of array
		for (int i=0; i<num; i++)
			a[i]=scanner.nextInt();
		
		Arrays.sort(a);     //sorted method
		System.out.print("The Second Largest Number: " +a[num-2]);  //printed the result
	}

}
