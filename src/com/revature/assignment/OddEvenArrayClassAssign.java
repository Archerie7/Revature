package com.revature.assignment;

public class OddEvenArrayClassAssign {
	public static void main(String[] args) {
		
		int array[] = {4, 5,  6, 7, 8, 9, 10, 11, 12, 13, 14};
		System.out.println("These are the odd numbers : ");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				System.out.println(array[i]);
			}	
		}
		System.out.println("These are even numbers : ");
		for(int i=0;i<array.length;i++) {
			if (array[i]%2==0) {
				System.out.println(array[i]);
		}
	}
}}



