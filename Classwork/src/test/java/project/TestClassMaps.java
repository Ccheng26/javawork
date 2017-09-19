package test.java.project;
import java.util.*;
public class TestClassMaps {
	public static void main(String[] args) {
		Map<String,String> m1= new HashMap<String,String>();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		for(Map.Entry<String, String> entry: m1.entrySet()) {
			System.out.println("Key : "+ entry.getKey()+" Value: "+entry.getValue());
		}
		System.out.println();
		System.out.println(" Map Elements");
		System.out.println("\t" +m1);
	}
}
