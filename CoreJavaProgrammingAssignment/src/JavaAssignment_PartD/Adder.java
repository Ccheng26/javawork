package JavaAssignment_PartD;
import java.util.*;

public class Adder extends Mathematician{
	
	//Adder class constructor with two parameters
	Adder(int num1, int num2){
		this.num1= num1;
		this.num2= num2;
		//instantiating timeRequested variable pulled from Mathematician
		this.timeRequested= Calendar.getInstance().getTimeInMillis();
	}
	
	//Adder class constructor with third parameters
	Adder(int num1, int num2, int num3){
		this.num1= num1;
		this.num2= num2;
		this.num3= num3;
		this.timeRequested= Calendar.getInstance().getTimeInMillis();
	}
	
	@Override
	//overload add function, by adding function body
	void add(int num1, int num2) {
		//store result of addition operation in this.result
		this.result= num1+num2;
		//get current time in milliseconds and divide it by 1000 (do type conversion to long) to get seconds
		long timeNow= Calendar.getInstance().getTimeInMillis()/(long)1000.0;
		this.timeRequested= this.timeRequested/(long)1000.0;
		//convert type to int and store in response time
		this.responseTime= (int)(timeNow-timeRequested);
		//pass result and response time to function print initialized in Mathematician class
		print(this.result, this.responseTime);
	}
	
	//add function that takes in three parameters
	void add(int num1, int num2, int num3) {
		this.result= num1+num2+num3;
		long timeNow= Calendar.getInstance().getTimeInMillis()/(long)1000.0;
		this.timeRequested= this.timeRequested/(long)1000.0;
		this.responseTime= (int)timeNow- (int)timeRequested;
		print(this.result, this.responseTime);
	}
	
	@Override
	void subtract(int num1, int num2) {
		// TODO Auto-generated method stub
	}

	@Override
	void multiply(int num1, int num2) {
		// TODO Auto-generated method stub
	}

	@Override
	void divide(int num1, int num2) {
		// TODO Auto-generated method stub
	}
	
}
