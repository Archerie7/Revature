package com.revature.assignment;

import java.util.Scanner;

public class OddEvenClassAssign {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	int num;
	System.out.println("Enter an Integer number : ");
	num=input.nextInt();
	if ( num % 2 == 0)
	System.out.println("Enter number is even");
	else
		System.out.println("Enter number is odd");
	}
	

}
 