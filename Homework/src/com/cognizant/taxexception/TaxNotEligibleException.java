package com.cognizant.taxexception;

public class TaxNotEligibleException extends Exception{
	double empSal;
	TaxNotEligibleException(double e){
		empSal=e;
	}
	public String toString() {
		return "The employee does not need to pay tax";
	}
}
