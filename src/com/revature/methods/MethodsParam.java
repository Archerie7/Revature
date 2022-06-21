package com.revature.methods;

import java.util.Scanner;

public class MethodsParam {
	public static void main(String[] args) {
		
	//function call
	sum(8,20);
	}

	public static void sum(int x, int y) {
		Scanner sc = new Scanner(System.in);
		int result = x - y;
		System.out.println("Difference of " + x + " - " + y + " = " + result);	
	}
}
