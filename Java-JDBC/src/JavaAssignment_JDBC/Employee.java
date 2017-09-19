package JavaAssignment_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

public class Employee {
	String firstName,lastName;
	Date timeIn,timeOut;
	int employeeNumber;
	Employee(String firstName, String lastName){
		this.firstName= firstName;
		this.lastName= lastName;
	}
	void createNewEmployee() {
		try {
			Statement stmt=null;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL= "jdbc:oracle:thin:@localhost:1521:orcl";
			//store properties
			Properties info = new Properties();
			info.put("user", "sys as SYSDBA");
			info.put("password", "password123");
			//establish connection
			
			Connection conn = DriverManager.getConnection(URL,info);
			
			System.out.print("Connected to jdbc");
			
			stmt=conn.createStatement();
			String insertData= "INSERT into employeess (firstName, lastName) "+ "VALUES (?,?)";
			PreparedStatement statement = conn.prepareStatement(insertData,
                    Statement.RETURN_GENERATED_KEYS);			
			stmt.executeUpdate(insertData);
			String query= "SELECT \"ISEQ$$_193606\".currval from dual; ";
			System.out.println(stmt.execute(query));
			conn.close();
		} catch(SQLException se) {
			se.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String args[]) {

		

	}
}
