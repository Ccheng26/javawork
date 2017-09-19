package com.cognizant.tax;

class EmployeeTax {
	public static void main(String[] args) {
		System.out.println("Test Case 1");
		TaxCalculator emp= new TaxCalculator(25000,true);
		emp.calculateTax();
		emp.deductTax();
		emp.validateSalary();

		System.out.println("\n"+ "Test Case 2");
		TaxCalculator emp2= new TaxCalculator(125000,true);
		emp2.calculateTax();
		emp2.deductTax();
		emp2.validateSalary();
	}
}
