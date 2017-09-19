package test.java.project;

import java.util.*;
public class TestClassStack {
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push("+a+")");
		System.out.println("stack: "+ st);
	}
	static void showpop(Stack st) {
		System.out.println("pop -> ");
		Integer a =(Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: "+st);
	}
	public static void main(String args[]) {
		Stack<Integer> s = new Stack();
		Stack<Integer> second = new Stack();
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		while(!s.isEmpty()) {
			second.push(s.pop());
		}
		System.out.println(second);
		System.out.println(s);

//		Stack<Integer> st = new Stack();
//		System.out.println("stack: "+st);
//		showpush(st, 42);
//		showpush(st, 66);
//		showpush(st, 99);
//		showpop(st);
//		showpop(st);
//		showpop(st);
//		try {
//			showpop(st);
//		}catch (EmptyStackException e) {
//			System.out.println("empty stack");
//		}
		

	}
}
