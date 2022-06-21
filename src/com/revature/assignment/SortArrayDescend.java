package com.revature.assignment;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescend {
	public static void main(String[] args) {

		//Define an array
		Integer[] array = {60, 56, 23, 78, 45, 35, 21, 8};
		
		System.out.println("The original array is : ");
		for (int num : array) {
			System.out.println(num + " ");
		}
		
		//Descending Array
		Arrays.sort(array, Collections.reverseOrder());
			System.out.println("Descending array : " + Arrays.toString(array));
		
		
		//Ascending Array
		Arrays.sort(array);
		System.out.println("Ascending array : " + Arrays.toString(array));
	}
}
