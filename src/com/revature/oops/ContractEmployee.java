package com.revature.oops;

public class ContractEmployee {
	private int id;
	private String name;
	private int hoursWorked;
	public ContractEmployee(int id, String name, int hoursWorked) {
		super();
		this.id = id;
		this.name = name;
		this.hoursWorked = hoursWorked;
	}
	public ContractEmployee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
		
}
	
