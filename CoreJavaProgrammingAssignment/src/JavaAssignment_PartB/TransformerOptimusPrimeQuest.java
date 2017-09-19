package JavaAssignment_PartB;
import java.io.*;

public class TransformerOptimusPrimeQuest {
	//declare x and y axis for coordinates
	int currentX, currentY;

	TransformerOptimusPrimeQuest(){
		//initialize variables to 0
		this.currentX=0;
		this.currentY=0;
	}
	void up() {
		//add 1 to y axis if moving up
		this.currentY+=1;
	}
	void down() {
		//subtract 1 from y axis if moving down
		this.currentY-=1;
	}
	void left() {
		//subtract 1 from x axis if moving left
		this.currentX-=1;
	}
	void right() {
		//add 1 from x axis if moving right
		this.currentX+=1;
	}
	public static void main(String args[]) throws IOException {
		//import InputStreamReader class and create new InputStreamReader object
		InputStreamReader read=new InputStreamReader(System.in);    
		//import BufferReader class and set new BufferedReader object to read
		BufferedReader bufferedR=new BufferedReader(read);
		//set readLine method from Buffered Reader to commands
	    String commands= bufferedR.readLine();

	    //create new TransformerOptimusPrime quest object named move
	    TransformerOptimusPrimeQuest move= new TransformerOptimusPrimeQuest();
	    
	    if(commands.length()<=10) {
	    	//if string of commands is less than or equal to 10, run this code block
	    	
	    	//iterate through command string
	    	for(int i=0;i<commands.length(); i++) {
	    		//check the characters at each command
	    		char command= commands.charAt(i);
	    		
	    		//use switch case to check movement depending on letter detected
	    		//if u, call up method; d, call down method; l , call left method; r, call right method
	    		//if either u, d, l or r is detected the methods change the x and y coordinates
	    		//default case is do nothing
	    		switch(command) {
	    			case 'U':
	    				move.up();
	    				break;
	    			case 'D':
	    				move.down();
	    				break;
	    			case 'L':
	    				move.left();
	    				break;
	    			case 'R':
	    				move.right();
	    				break;
	    			default:
	    				break;
	    		}
	    	}
	    	//print coordinates
	    	System.out.println(move.currentX+ " "+ move.currentY);
	    } else {
	    	//if over 10 characters given, print statement
	    	System.out.println("I won’t be able to make it that far");
	    }
	}
}
