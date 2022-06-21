package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo {
	public static void mult() {
		mult();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int n1=sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int n2=sc.nextInt();
		
		int result = n1 * n2;
		System.out.println("Product of " + n1 + " * " + n2 + " = " + result);
		
	}

	}


