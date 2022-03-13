package com.gl.assignment.employee;

/**
 *  Empolyee class  will take only Firstname and Lastname and return it using getter method. 
 *
 */


public class Employee{

	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public  String getfirstName() {
		 
		return firstName;
	}
	public String getlastName() {
		
		return lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
