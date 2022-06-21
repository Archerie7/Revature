package com.revature.assignment;

import java.util.Scanner;

public class SmallestNomClassAssign {
	public static void main(String[] args) {
		int a, b, c, smallest, temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		b = sc.nextInt();
		
		System.out.println("Enter the third number : ");
		c=sc.nextInt();
		
		//Compare a and b and Store Smallest Num
		temp = a<b? a:b;
		
		//Compare and store variable with c
		smallest = c<temp? c:temp;
		
		System.out.println("This is the smalles number : " +smallest);
	}

}
