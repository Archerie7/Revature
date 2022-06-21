package com.revature.assignment;

import java.util.Scanner;

public class MathMethodClassAssign {

	public static void main(String[] args) {
		mult();
		div();
		sub();
		add();		
		}
	public static void mult() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int n2 = sc.nextInt();
		int result = n1 * n2;
		System.out.println("Product of " + n1 + " * " + n2 + " is " + result);	
	}
	public static void div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Number :");
		int n2 = sc.nextInt();
		int result = n1 / n2;
		System.out.println("Quotient of " + n1 + " / " + n2 + " is " + result);	
	}
	public static void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n1 =sc.nextInt();
		System.out.println("Enter Number : ");
		int n2 = sc.nextInt();
		int result = n1 - n2;
		System.out.println("Difference of " + n1 + " - " + n2 + " is " + result);	
	}
	public static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int n2 = sc.nextInt();
		int result = n1 + n2;
		System.out.println("Sum of " + n1 + " + " + n2 + " is " + result);	
	}
}
