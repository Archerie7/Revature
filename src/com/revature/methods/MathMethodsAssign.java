package com.revature.methods;

import java.util.Scanner;

public class MathMethodsAssign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mul();
		sub();
		div();
		sum();
	}

	public static void mul() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int n2=sc.nextInt();
		
		int result = n1 * n2;
		System.out.println("Result of " + n1 + " * " + n2 + " = " + result);
		
	}

	public static void sub() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int n2=sc.nextInt();
		
		int result =n1 - n2;
		System.out.println("Result of " + n1 + " - " + n2 + " = " + result);
	
	}

	public static void div() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int n2=sc.nextInt();
		
		int result = n1 / n2;
		System.out.println("Result of " + n1 + " / " + n2 + " = " + result);
			
	}

	public static void sum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int n1=sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int n2=sc.nextInt();
		
		int result = n1 + n2;
		System.out.println("Result of " + n1 + " + " + n2 + " = " + result);
		
	}

}
