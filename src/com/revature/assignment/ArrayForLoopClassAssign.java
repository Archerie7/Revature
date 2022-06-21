package com.revature.assignment;

public class ArrayForLoopClassAssign {
	public static int j;

	public static void main(String[] args) {
		
		int marks[] = new int[5];
		int []arr2 = {1,2,3,4,5,6,7,8};
		marks[0] = 10;
		marks[1] = 12;
		marks[2] = 14;
		marks[3] = 16;
		marks[4] = 17;
		
		System.out.println("Length of Marks Array : "+marks.length);
		System.out.println("Displaying the Third element : "+marks[2]);
	
	for (int i=0; i<5; i++)
		System.out.println(marks[i]);
	
	for (int j=0; j<marks.length;j++);
		System.out.println(marks[j]);
		
	for (int m:marks)
		System.out.println(m);
		
		
	}
}

