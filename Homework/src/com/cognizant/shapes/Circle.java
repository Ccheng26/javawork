package com.cognizant.shapes;

public class Circle{
	float radius;
	//Constructor1
	Circle (){
		this.radius=1.5f;
	}
	
	public void calculateArea(int radius) {
		float areaC= (float)3.14 *radius *radius;
		System.out.println("The Area of the Circle is " + areaC);
	}
}
