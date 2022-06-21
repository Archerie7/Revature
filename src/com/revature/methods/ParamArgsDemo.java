package com.revature.methods;

import java.util.Scanner;

public class ParamArgsDemo {
	public static void main(String[] args) {
		
		//function call
		add(8,20);
		
	}

	private static void add(int i, int j) {
		Scanner sc = new Scanner(System.in);
		int result = i + j;
		System.out.println("Sum of " + i + " + " + j + " = " + result);	
	}
}
