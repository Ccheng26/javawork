package JavaAssignment_PartD;
import java.io.*; 
import java.util.*;

//abstract class Mathematician
public abstract class Mathematician {
	
	//declare protected variables
	protected int num1, num2, num3, result, responseTime;
	
	//changed to long from Date, since you can't get latter in milliseconds
	long timeRequested;
	
	//declare abstract functions that take in two parameters
	abstract void add(int num1, int num2);
	abstract void subtract(int num1, int num2);
	abstract void multiply(int num1, int num2);
	abstract void divide(int num1, int num2);
	
	//function to print result and time in seconds
	void print(int result,int seconds) {
		System.out.println("The answer to your inquiry is '"+result+"' ");
		System.out.println("Response time: '"+seconds+"' seconds");
	}
	
}
