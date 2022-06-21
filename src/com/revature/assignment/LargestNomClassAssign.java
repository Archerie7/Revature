package com.revature.assignment;

public class LargestNomClassAssign {
	public static void main(String[] args) {
	
	//numbers to compare
	int a=80, b=99, c=30;
	
	//compare abc
	if(a>=b && a>=c)
		System.out.println("The largest of the three numbers is "+a);
	
	else if(b>=a && b>=c)
		System.out.println("The largest of the three numbers is "+b);
	else
		System.out.println("The largest of the three number is "+c);
	}

}
