package com.cognizant.taxexception;

public class EmployeeNameInvalidException extends Exception{
	EmployeeNameInvalidException(){
	}
	public String toString() {
		return "The employee name cannot be empty";
	}
}
