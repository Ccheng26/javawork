package com.jdbc.example;
import java.sql.*;
import java.util.*;

public class ConnExample {
	public static void main(String []args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL= "jdbc:oracle:thin:@localhost:1521:orcl";
			Properties info = new Properties();
			//			key	 value; properties can hold a key & value
			info.put("user", "sys as SYSDBA"); //note that you need to designate role
			info.put("password", "password123");
			Connection conn = DriverManager.getConnection(URL,info);
	//OR	String USER = "username",PASS= "password"
	//		Connection conn = DriverManager.getConnection(URL,USER,PASS);
			//perform queries here
			System.out.println("connected to jdbc");
			conn.close(); //closing connection
		} catch(ClassNotFoundException ex) {
			System.out.println("Error unable to load driver class!");
			System.exit(1);
		}
	}
}
