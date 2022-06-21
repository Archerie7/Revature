package com.revature.myclass;

public class EmployeeAssign {
	int id;
	String name;
	String dept;
	String salary;

	public void createEmployeeAssign(int id, String name, String dept, String salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public void displayEmployee() {
		System.out.println("Employee ID : " + this.id  + " Employee Name : " + this.name + " Employee Dept : " + this.dept + " Employee Salary : " + this.salary);
	}
}
