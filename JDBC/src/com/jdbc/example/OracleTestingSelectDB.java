package com.jdbc.example;
import java.sql.*;
import java.util.*;
import java.math.*;

public class OracleTestingSelectDB {
	static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL= "jdbc:oracle:thin:@localhost:1521:orcl";
	//Database credentials
	static final String USER="sys as sysdba";
	static final String PASS="password123";
	public static void main(String []args) {
		Connection conn=null;
		try {
			//Step2: Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Step3: Open a connection
			System.out.println("Connecting to a selected database..");
			conn= DriverManager.getConnection(DB_URL, USER,PASS);
			System.out.println("Conneced database successfully");
		}catch(SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally {
			//Finally block used to close resources
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main
}
