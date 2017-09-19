package JavaAssignment_PartC;
import java.util.*;

public class Number_Program extends Thread {
	//declare variables
	int start, end;
	String numberType;
	List<Integer> numberList;
	
	//constructor that initializes variables
	Number_Program(String numberType, int start, int end){
		this.numberType= numberType;
		this.start=start;
		this.end=end;
		this.numberList=null;
	}
	//override run function
	@Override
	public void run() {
		if(this.numberType=="EVEN") {		//if numberType is even, run this thread
			//declare new arrayList
			this.numberList = new ArrayList<Integer>();
			//iterate from start to end and check for even, if even push to arrayList
			for(int i= start; i<=end; i++) {
				if(i%2==0) {
					this.numberList.add(i);
				}
			}

		}else if(this.numberType=="ODD") {	//if numberType is odd, run this thread
			//declare new arrayList
			this.numberList = new ArrayList<Integer>();
			//iterate from start to end and check for odd, if odd push to arrayList
			for(int i= start; i<=end; i++) {
				if(i%2==1) {
					this.numberList.add(i);
				}
			}
		}
	}
	//function to display numbers, print out using for each
	void display() {
		for(Integer i:numberList) {
			System.out.print(i+ " ");
		}
	}
	
}
