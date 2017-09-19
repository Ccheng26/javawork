package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTestingSelectDynamicRecord {
	static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL= "jdbc:oracle:thin:@localhost:1521:orcl";
	//Database credentials
	static final String USER="sys as sysdba";
	static final String PASS="password123";
	
	public static void main(String []args) {
		Connection conn=null;
//		Statement stmt=null;
		PreparedStatement stmt=null; 
		try {
			//Step2: Register JDBC driver
			Class.forName(JDBC_DRIVER);
			//Step3: Open a connection
			System.out.println("Connecting to a selected database..");
			conn= DriverManager.getConnection(DB_URL, USER,PASS);
			System.out.println("Conneced database successfully");
			//Step4: Execute a query
			System.out.println("Creating a statement...");
//			stmt= conn.createStatement();
			
			//To Select
			String sql="";
			sql= "SELECT firstname, lastname,age FROM student_info WHERE firstname=?";
			
			stmt= conn.prepareStatement(sql);
			stmt.setString(1,"joe");
			//To insert
			//String val1= "bill"; String val2= "bob"; String val3="5";
			
			//ResultSet rs= stmt.executeQuery(sql); for select
			ResultSet rs= stmt.executeQuery();
			//Step5: Extract data from result set
			while(rs.next()) {
				//retrieve by column name
				String firstname=rs.getString("firstname");
				String lastname=rs.getString("lastname");
				String age=rs.getString("age");
				//Display values
				System.out.println("first name "+firstname);
				System.out.println("last name "+lastname);
				System.out.println("age "+age);
			}
		}catch(SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally {
			//Finally block used to close resources
			try {
				if(stmt!=null) {
					conn.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}//do nothing
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
