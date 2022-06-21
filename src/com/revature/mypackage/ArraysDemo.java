package com.revature.mypackage;

public class ArraysDemo {
	public static void main(String[] args) {
		
		//Declare an array
		int[] myInts = new int[]{1,2,3,4};
		String languages[] = {"Java", "Javascript", "SQL"};
		
		//Referencing array
		String[] myArr = {"first", "second", "third"};
		for (int i = 0; i<myArr.length; i++) {
			System.out.println(i);
		}
	}
}
