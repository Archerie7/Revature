package com.revature.assignment;

public class ArrayAverageClassAssign {
	public static void main(String[] args) {
		int[]array = {13,45,23,21,43,34,2,3,4,5};
		int length=array.length;
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum +=array[i];
		}
		double average=length;
		
		System.out.println("Average of an array : "+average);
	}
}
