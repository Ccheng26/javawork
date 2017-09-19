package JavaAssignment_PartC;

import java.util.Scanner;

public class Main_Program {
	public static void main(String[] args) throws InterruptedException {
		//declare new scanner object from class Scanner
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a range of numbers");
		
		//store start value and end value
		int st = scanner.nextInt();
		int ed = scanner.nextInt();
		
		//initialize two threads
		//passing parameters for initialization: odd or even thread, range for start and end numbers
		Number_Program newSetPartOne= new Number_Program("ODD", st, ed);
		Number_Program newSetPartTwo= new Number_Program("EVEN", st, ed);
		
		//start both threads
		newSetPartOne.start();
		newSetPartTwo.start();
		
		//join both threads
		newSetPartOne.join();
		newSetPartTwo.join();
		
		//display results
		System.out.println("Odd numbers in given range");
		newSetPartOne.display();
		System.out.println("\nEven numbers in given range");
		newSetPartTwo.display();
	}
}
