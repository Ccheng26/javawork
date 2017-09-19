package com.cognizant.taxexception;

public class TaxCalculator {
	double taxAmount;
//	boolean isIndian;
//	String empName;
	double calculateTax(String empName, boolean isIndian, double empSal) {
		if(empName==""||empName==null) {
			try {
				throw new EmployeeNameInvalidException();
			} catch(EmployeeNameInvalidException e) {
				e.printStackTrace();
			}
		} else if(isIndian==false) {
			try {
				throw new CountryNotValidException();
			} catch(CountryNotValidException e) {
				e.printStackTrace();
			}
		}else if (empSal>100000 && isIndian==true) {
			taxAmount= empSal*(8/(double)100);
		} else if(empSal<=100000 && empSal>50000 && isIndian==true) {
			taxAmount= empSal*(6/(double)100);
		} else if(empSal<=50000 && empSal>30000 && isIndian==true) {
			taxAmount= empSal*(5/(double)100);
		} else if(empSal<=30000 && empSal>10000 && isIndian==true) {
			taxAmount= empSal*(4/(double)100);
		} else {
			try {
				throw new TaxNotEligibleException(empSal);
			} catch (TaxNotEligibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return taxAmount;
	}
}
