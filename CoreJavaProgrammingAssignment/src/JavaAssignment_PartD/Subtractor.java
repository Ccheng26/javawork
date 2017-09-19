package JavaAssignment_PartD;

import java.util.Calendar;

public class Subtractor extends Mathematician{
	
	//constructor with two parameters
	Subtractor(int num1, int num2){
		this.num1= num1;
		this.num2= num2;
		this.timeRequested= Calendar.getInstance().getTimeInMillis();
	}
	
	//constructor with three parameters
	Subtractor(int num1, int num2, int num3){
		this.num1= num1;
		this.num2= num2;
		this.num3= num3;
		this.timeRequested= Calendar.getInstance().getTimeInMillis();
	}
	
	@Override
	void add(int num1, int num2) {
		// TODO Auto-generated method stub
	}

	@Override
	//overload subtraction function, by adding function body
	void subtract(int num1, int num2) {
		this.result= num1-num2;
		long timeNow= Calendar.getInstance().getTimeInMillis()/(long)1000.0;
		this.timeRequested= this.timeRequested/(long)1000.0;
		this.responseTime= (int)(timeNow-timeRequested);
		print(this.result, this.responseTime);
	}
	
	void subtract(int num1, int num2, int num3) {
		this.result= num1-num2-num3;
		long timeNow= Calendar.getInstance().getTimeInMillis()/(long)1000.0;
		this.timeRequested= this.timeRequested/(long)1000.0;
		this.responseTime= (int)timeNow- (int)timeRequested;
		print(this.result, this.responseTime);
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
