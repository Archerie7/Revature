package com.revature.assignment;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayAscend {

	public static void main(String[] args) {

	//Define an array
	int[] arr= {60, 56, 23, 78, 45, 35, 21, 8};
	
	System.out.println("The original array is : ");
	for (int num : arr) {
		System.out.println(num + " ");
	}
	
	Arrays.sort(arr);
	System.out.println("Ascending array : " + Arrays.toString(arr));
	
	}
}
