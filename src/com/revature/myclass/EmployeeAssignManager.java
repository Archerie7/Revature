package com.revature.myclass;

public class EmployeeAssignManager {
	public static void main(String[] args) {
		
		//Create an Object of employee
		EmployeeAssign e1 = new EmployeeAssign();
		e1.createEmployeeAssign(100, "James Burt", "HR", "$65000");
		
		//Create a Second Object
		EmployeeAssign e2 = new EmployeeAssign();
		e2.createEmployeeAssign(101, "Arch Shaw", "FD", "$70000");
		
		//Create a Third Object
		EmployeeAssign e3 = new EmployeeAssign();
		e3.createEmployeeAssign(102, "Fred Mac", "Finace", "$75000");
		
		//Create a Fourth Object
		EmployeeAssign e4 = new EmployeeAssign();
		e4.createEmployeeAssign(103, "Jim Tim", "IT", "$80000");
		
		//Create a Fifth Object
		EmployeeAssign e5 = new EmployeeAssign();
		e5.createEmployeeAssign(104, "Tim Ber", "Engineering", "$85000");
		
		//Call the display method
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
		e4.displayEmployee();
		e5.displayEmployee();
		
		int []myArr=new int[5];
		
		EmployeeAssign [] employee = new EmployeeAssign[5];
		for(int i=0;i<employee.length;i++)
		employee[i] = new EmployeeAssign();
		
		
			
	}

}
