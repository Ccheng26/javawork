package com.cognizant.taxexception;

public class CountryNotValidException extends Exception {
	String country;
	CountryNotValidException(){
	}
	public String toString() {
		return "The employee should be an Indian citizen for calculating tax";
	}
}
