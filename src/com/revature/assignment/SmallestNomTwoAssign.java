package com.revature.assignment;

public class SmallestNomTwoAssign {
	public static void main(String[] args) {
		
		//numbers to compare
		int a=101, b=8, c=19;
		
		if(a<=b && a<=c)
			System.out.println("The smallest number is "+a);
		
		else if(b<=a && b<=c)
			System.out.println("The smallest number is "+b);
		
		else
			System.out.println("The smallest number is "+c);
	}

}
