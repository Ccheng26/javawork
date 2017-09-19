package com.cognizant.shapes;

public class Shapes{
	
	private int numberOfSides; 
	//NOTE: best place to declare constructor
	public Shapes(int shape){
		//if you don't provide visibility access, it's private
		this.numberOfSides= shape;
	};
	
	public static void main(String[] args) {
		// Test Case 1
		Shapes s1= new Shapes(3);
		s1.calculateShapeArea(12);
		// Test Case 2
		Shapes s2= new Shapes(4);
		s2.calculateShapeArea(15);
		// Test Case 3
		Shapes s3= new Shapes(5);
		s3.calculateShapeArea(15);
		
		// Problem Statement 3: Prime numbers printed 1-150
		int num = 1;
		while(num<150) {
			boolean prime= true;
			num++;
			int srt= (int)Math.sqrt(num);
			if(num %2 == 0 && num!=2) {
				continue; //skips the next iteration
			}
			for(int i = 3; i<=srt; i++) {
				if(num%i==0) {
					prime= false;
					break;
				}
			}
			if(prime) {
				System.out.println(num);
			}			
		}; // End Problem Statement 3
	}; // End main

	void calculateShapeArea(int sideLength) {		
		// Problem Statement 1: If/Else
		if(this.numberOfSides == 1) { //classes can be a data type
			Circle c= new Circle(); //new is invoking a constructor method that creates a new object; constructor is the same name as the class
			c.calculateArea(sideLength);
		} else if (numberOfSides == 3) {
			Triangle t= new Triangle();
			t.calculateArea(sideLength);
		} else if (numberOfSides == 4) {
			Square s= new Square();
			s.calculateArea(sideLength);
		} else {
			System.out.println("No Shapes Present");
		}; // End Problem Statement 1
		// Problem Statement 2: Switch Case
		switch(numberOfSides) {
			case 1:
				Circle c= new Circle();
				c.calculateArea(sideLength);
				break;
			case 3:
				Triangle t= new Triangle();
				t.calculateArea(sideLength);
				break;
			case 4:
				Square s= new Square();
				s.calculateArea(sideLength);
				break;
			default:
				System.out.println("No Shapes Present");
				break;
		}; // End Problem Statement 2
	};	// End Calculate Shape Area
};