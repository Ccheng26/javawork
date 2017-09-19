package test.java.project;
import java.util.*;

//tree map is faster than map, b/c it's binary and sorts it
public class TestClassTreeMap {
	public static void main(String args[]) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(100, "Amit");
		hm.put(102, "Ravt");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		System.out.println("\n============================================\n");
			//get a set of the entries
			Set set = hm.entrySet();
			//get an iterator
			Iterator i= set.iterator();
			//display elements
			while(i.hasNext()) {
				Map.Entry me= (Map.Entry)i.next();
				System.out.println(me.getKey()+": ");
				System.out.println(me.getValue());
			}
	}
}
