package com.revature.mypackage;

import java.util.Scanner;

public class VarArgsArrayDemo {
	
	public static void main(String[] args, char[][] manyInts, String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First argument: " + a);
		System.out.println("Next argument: ");	
			
			for (int i=0;i<manyInts.length;i++) {
				System.out.println(manyInts[i]);
		}
	}
		public static void main(String[] args) {
			VarArgsArrayDemo.someMethod(1,3,4,5,6);
			System.out.println("First Argument : "+1);
			System.out.println("Next argument: ");
		}
		public static void someMethod(int i, int j, int k, int l, int m) {
			// TODO Auto-generated method stub
			
		}
}

