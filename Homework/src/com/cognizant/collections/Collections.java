package com.cognizant.collections;
import java.util.ArrayList;

public class Collections {
//	public ArrayList<Integer> arrL= new ArrayList<Integer>();
	ArrayList A1= new ArrayList<Integer>();
	ArrayList A2= new ArrayList<Integer>();
	ArrayList<Integer> storeEvenNumbers(int N) {
		for(int i=2;i<N; i++) {
			if(i%2==0) {
				A1.add(i);
			}
		}
		return A1;
	}
	ArrayList<Integer> printEvenNumbers (){
		for(int i=0;i<A1.size(); i++) {
			A2.add(2*((int)A1.get(i)));
		}
		return A2;
	}
	int retrieveEvenNumber(int N){
		boolean found=false;
		for(int i=0;i<A1.size(); i++) {
			if((int)A1.get(i)==N) {
				found= true;
			}
		}
		if(found) {
			return N;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Collections c= new Collections();
		System.out.println(c.storeEvenNumbers(10));
		System.out.println(c.printEvenNumbers());
		System.out.println(c.retrieveEvenNumber(20)); 
	}
}
