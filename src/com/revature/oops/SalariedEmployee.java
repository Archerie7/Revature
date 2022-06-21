package com.revature.oops;

public class SalariedEmployee extends Employee{
	private int daysPresent;

	public SalariedEmployee() {
		super(); // call to the employee constructor
		System.out.println("salaried Employee Default Constructor ....");
	}
	
	public SalariedEmployee(int id, String name, int daysPresent) {
		super(id, name);
		this.daysPresent = daysPresent;
	}
	
	
	
	}
	


