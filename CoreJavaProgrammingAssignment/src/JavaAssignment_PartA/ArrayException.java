package JavaAssignment_PartA;
import java.util.*;

public class ArrayException {
	public static void main(String args[]) {
		//declare variables
		int arrSize;
		int [] arr;
		int index;
		//create a new scanner object from class Scanner
		Scanner scanner= new Scanner(System.in);
		
		//prompt user to enter size of array
		System.out.println("Enter the number of elements in the array");
		//take user prompt for array number
		arrSize = scanner.nextInt();
		//define the array size
		arr= new int[arrSize];
		
		//prompt user to enter numbers to put in array
		System.out.println("Enter the elements in the array ");
		
		//user enters numbers for array, scanner will keep taking input until array length is met
		for(int i=0; i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		//try/catch for checking for array elements
		try {
			//prompt user for index
			System.out.println("Enter the index of the array element you want to access");
			//store index to search for in array
			index= scanner.nextInt();
			//print out element at array
			System.out.println("The array element at index "+ index +" = "+arr[index]);
			System.out.println("The array element successfully accessed");
		}catch(ArrayIndexOutOfBoundsException e){
			//if index is not in array(index exceeds length of array), exception is thrown
			//prints the class of the exception
			System.out.println(e.getClass());
		}
	}
}
