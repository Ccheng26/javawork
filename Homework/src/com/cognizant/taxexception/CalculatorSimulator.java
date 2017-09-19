package com.cognizant.taxexception;

public class CalculatorSimulator {
	public static void main(String []args) {
		TaxCalculator empC= new TaxCalculator();
		//Test Case 1
		if(empC.calculateTax("Ron", false, 34000)!=0) {
			System.out.println("Tax amount is " + empC.calculateTax("Ron", false, 34000));
		}
		//Test Case 2
		if(empC.calculateTax("Tim", true, 1000)!=0) {
			System.out.println("Tax amount is " + empC.calculateTax("Tim", true, 1000));
		}
		//Test Case 3
		if(empC.calculateTax("Jack", true, 55000)!=0) {
		System.out.println("Tax amount is " + empC.calculateTax("Jack", true, 55000));
		}
		//Test Case 4
		if(empC.calculateTax("", true, 30000)!=0) {
			System.out.println("Tax amount is " + empC.calculateTax("", true, 30000));
		}
	}
}
