package JavaAssignment_JDBC;
import java.io.*; 
import java.util.*;
import java.sql.*;

public class Main {
	public static void main(String []args) throws SQLException {
		try {
			
			//register jdbc connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL= "jdbc:oracle:thin:@localhost:1521:orcl";
			//store properties
			Properties info = new Properties();
			info.put("user", "sys as SYSDBA");
			info.put("password", "password123");
			//establish connection
			Connection conn = DriverManager.getConnection(URL,info);
			System.out.print("Connected to jdbc");
			
			/* Creating Employee Table
			 
			//storing createStatement in stmt
			Statement stmt=null;
			stmt=conn.createStatement();
			//creating query here
			String createEmpTable ="CREATE TABLE Employees("
					//auto generating user id
					+ "EmployeeNo NUMERIC(10) GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1) NOT NULL,"
					+ "firstName VARCHAR(255),"
					+ "lastName VARCHAR(255),"
					+ "time_in VARCHAR(255),"
					+ "time_out VARCHAR(255),"
					+ "CONSTRAINT emp_id_pk PRIMARY KEY (EmployeeNo)"
					+ ")";
			//calling query here
			stmt.execute(createEmpTable);
			*/
			conn.close();
		} catch(ClassNotFoundException ex) {
			System.out.println("Error unable to load driver class!");
			ex.printStackTrace();
			System.exit(1);
		}
	}
}
