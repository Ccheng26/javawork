package JavaAssignment_PartD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class InputCollector {
	//declare variables
	long timeRequested;
	int num1,num2,num3;
	
	//constructor to assign timeRequested time in milliseconds
	InputCollector(){
		Calendar time=Calendar.getInstance();
		timeRequested=time.getTimeInMillis();
	}
	
	
	void collectInput() throws IOException {
		//store time from calendar object into date type
		Date dateTime= Calendar.getInstance().getTime();
		//convert date object to string
		String outputByte= dateTime.toString();
		
		//prompt
		System.out.println("Do you want to:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		//create a new scanner object from class Scanner
		Scanner sc = new Scanner(System.in);
		
		//store option in calc 1-4
		int calc= sc.nextInt();
		
		//prompt users for integers and store them in variables
		System.out.println("What is the first integer?");
		this.num1= sc.nextInt();
		System.out.println("What is the second integer?");
		this.num2=sc.nextInt();
		
		System.out.println("Do you have a third integer?");
		System.out.println("Enter ‘1’ for Yes");
		System.out.println("Enter ‘2’ for No");
		//stores option requested for third integer
		int third= sc.nextInt();
		
		//create flag for if there is a third integer
		boolean hasThird= false;
		if(third==1) {
			//if option 1 selected, set flag to true and take in next int
			hasThird=true;
			System.out.println("What is the third integer?");
			this.num3=sc.nextInt();
		} else if(third==2) {
			//if option 2 do nothing
		} else {
			//print not a valid option if not 1 or 2
			System.out.println("Not a valid option");
		}
		
		//create new file object from File class
		File mathematicianLogBook= new File("Mathematician’s Log book.txt");
		//create outputStream from FileWriter class
		FileWriter outputStream= new FileWriter(mathematicianLogBook, true);
		try {
			if(mathematicianLogBook.exists()) {	
				//if file exists run code block
				//switch case to check option selected 
				//nested if statement to check if program should run operation with three parameters
				//write the time to the file
				//write System.lineSeparator() to print time calculation on next line
				switch(calc) {
				case 1:		
					if(hasThird) {
						Adder addThree= new Adder(this.num1, this.num2, this.num3);
						addThree.add(num1, num2, num3);
					} else if(third==2 && hasThird==false) {
						Adder addTwo= new Adder(this.num1, this.num2);
						addTwo.add(num1, num2);
					}
					outputStream.write(outputByte);
					outputStream.write(System.lineSeparator());
					break;
				case 2:
					if(hasThird) {
						Subtractor subThree= new Subtractor(this.num1, this.num2, this.num3);
						subThree.subtract(num1, num2, num3);
					}  else if(third==2 && hasThird==false) {
						Subtractor subTwo= new Subtractor(this.num1, this.num2);
						subTwo.subtract(num1, num2);
					}
					outputStream.write(outputByte);
					outputStream.write(System.lineSeparator());
					break;
				case 3:
					if(hasThird) {
						Multiplier multThree= new Multiplier(this.num1, this.num2, this.num3);
						multThree.multiply(num1, num2, num3);
					} else if(third==2 && hasThird==false) {
						Multiplier multTwo= new Multiplier(this.num1, this.num2);
						multTwo.multiply(num1, num2);
					}
					outputStream.write(outputByte);
					outputStream.write(System.lineSeparator());
					break;
				case 4:
					if(hasThird) {
						Divider divThree= new Divider(this.num1, this.num2, this.num3);
						divThree.divide(num1, num2, num3);
					}  else if(third==2 && hasThird==false) {
						Divider divTwo= new Divider(this.num1, this.num2);
						divTwo.divide(num1, num2);
					}
					outputStream.write(outputByte);
					outputStream.write(System.lineSeparator());
					break;
				default:
					// if no valid options selected print not a valid condition
					System.out.println("Not a valid condition");
					break;
				}
				//close output stream
				outputStream.close();
			} else {
				//if file does not exist, create a new file
				mathematicianLogBook.createNewFile();
			}
			//garbage collection manual function called
			System.gc();
		} catch(IOException e) {
			//if input output exception called, print stack trace
			e.printStackTrace();
		} finally {
			//make sure outputStream is closed again here
			outputStream.close();
		}
	}
}
