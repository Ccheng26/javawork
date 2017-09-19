package com.junit.scholar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResearchScholar implements Scholar {
	// Registers the details of the scholar if age >= 28 years

	public boolean register(String name, int age, String subject, String guideName) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		try {
			if(age >= 28) {
				OracleConnection oracle= new OracleConnection();
				conn = oracle.getConnection();
				stmt = conn.prepareStatement("INSERT INTO scholar(name, age, subject, guidename) VALUES (?, ?, ?, ?)");
				stmt.executeQuery();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
		
	};

	@Override
	// If registration is successful, then the method assigns a rank
	// Marks <= 50; Rank = D
	// Marks > 50 and <=70; Rank = C
	// Marks > 70 and <=90; Rank = B
	// Marks > 90; Rank = A

	public void rank(int marks) {
		// TODO Auto-generated method stub

	}
}
