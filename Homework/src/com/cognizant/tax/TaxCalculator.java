package com.cognizant.tax;

public class TaxCalculator {
	float basicSalary,tax;
	boolean citizenship;

	TaxCalculator(float basicSalary, boolean citizenship){
		this.basicSalary=basicSalary;
		this.citizenship=citizenship;
	}
	
	void calculateTax(){
		this.tax = 30*this.basicSalary/100;
		System.out.println("The Tax of the employee for the " + (int)basicSalary + " is " + (int)tax);
	}
	void deductTax() {
		int nettSalary = (int)this.basicSalary- (int)this.tax;
		System.out.println("The nett salary of the employee " + nettSalary);
	}
	void validateSalary() {
		if(citizenship==true && basicSalary>100000) {
			System.out.println("The salary and citizenship eligibility: true");
		} else {
			System.out.println("The salary and citizenship eligibility: false");
		}
	}

}
