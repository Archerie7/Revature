package com.revature.stringapi;

public class AutoBoxingDemo {
	public static void main(String[] args) {
		
	int n=5;
	
	someMethod(n);
	
	}
	public static void someMethod(Integer i) {
		System.out.println(i + 3);
		System.out.println("Autoboxing is created. ");
		
	}

}
