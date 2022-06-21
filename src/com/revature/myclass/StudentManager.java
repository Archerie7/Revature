package com.revature.myclass;

public class StudentManager {
	public static void main(String[] args) {
		
		//Create an Object of Student class
		Student s1 = new Student();
		s1.createStudent(101, "Giant", "Java");
		
		//Create a second Object
		Student s2 = new Student();
		s2.createStudent(102, "Arch", "AWS");
		
		//Call the display method
		s1.displayStudent();
		s2.displayStudent();
	}

}
