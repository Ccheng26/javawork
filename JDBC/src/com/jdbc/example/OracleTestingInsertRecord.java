package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTestingInsertRecord {
	static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL= "jdbc:oracle:thin:@localhost:1521:orcl";
	//Database credentials
	static final String USER="sys as sysdba";
	static final String PASS="password123";
	
	public static void main(String []args) {
		Connection conn=null;
		Statement stmt=null;
		//PreparedStatement stmt=null; 
		try {
			//Step2: Register JDBC driver
			Class.forName(JDBC_DRIVER);
			//Step3: Open a connection
			System.out.println("Connecting to a selected database..");
			conn= DriverManager.getConnection(DB_URL, USER,PASS);
			System.out.println("Conneced database successfully");
			//Step4: Execute a query
			System.out.println("Creating a statement...");
			stmt= conn.createStatement(); //for select and insert?
			
			//To Select
			String sql="";

			sql= "INSERT INTO student_info"+" VALUES ('hi','hello','5')";
			stmt.executeUpdate(sql);
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
