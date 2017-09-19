package com.junit.scholar;

public interface Scholar {
	//Registers the details of the scholar
	public boolean register(String name, int age, String subject, String guideName);
	//Assigns a rank based on the marks
	public void rank(int marks);
}
