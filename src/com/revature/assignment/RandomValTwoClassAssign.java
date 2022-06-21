package com.revature.assignment;

import java.util.Scanner;

public class RandomValTwoClassAssign {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter array size: " );
		
			int size=s.nextInt();
			int []array=new int[5];
			
			System.out.println("Enter array values : " );
			for(int i=0;i>=5;i++);{
				int value=s.nextInt();
				array[0]=value;
			}
				
				int length=array.length;
				int sum=0;
				for(int i=0;i<array.length; i++) {
					sum +=array[i];
					
				}
				double average = sum/length;
				System.out.println("Average of array: " +average);
		}
			
	}
		

	



