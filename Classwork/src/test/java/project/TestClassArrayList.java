package test.java.project;
import java.util.*;

public class TestClassArrayList {
	public static void main(String[] args) {
		// create an array list
		ArrayList a1 = new ArrayList();
		System.out.println("Initial size of a1: "+ a1.size());
		//add elements to the array list
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add(1,"A2");
		System.out.println("Size of a1 after additionas: "+a1.size());
		//display the array list
		System.out.println("Contents of a1: "+ a1);
		a1.remove("F"); //performs a for loop in remove, parameter is F, goes through F
		a1.remove(2);
		
		System.out.println("Size of a1 after deletions "+a1.size());
		System.out.println("Contents of a1: "+ a1);
		
		ArrayList a2= new ArrayList();
		for(int i=1; i<=100;i++) {
			if(i%15==0) {
				a2.add(i);
			}
		}
		System.out.println(a2.size());
	}
}
