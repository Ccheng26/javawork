package com.cognizant.inheritance_activity;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance;
	double Hra;
	Employee(){
		this.specialAllowance=250.8;
		this.Hra= 1000.5;
	}
	Employee(long Id, String Name, String address, long phone){
		this.employeeId= Id;
		this.employeeName= Name;
		this.employeeAddress= address;
		this.employeePhone= phone;
	}
	double calculateSalary() {
		double salary;
		salary= basicSalary+(basicSalary * specialAllowance/100)+ (basicSalary*Hra/100);
		return salary;
	}
}
