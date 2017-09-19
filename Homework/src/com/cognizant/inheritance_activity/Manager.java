package com.cognizant.inheritance_activity;

public class Manager extends Employee{
	double basicSalary;
	Manager(long Id, String Name, String address, long phone, double salary){
		super(Id, Name, address, phone);
	}
	Manager(){
		
	}
}
