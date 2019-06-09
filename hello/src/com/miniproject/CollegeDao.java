package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class CollegeDao {
	
	public void add(College coll) {
		Connection conn = null;
		PreparedStatement stmt = null; 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		String sql = "insert into college values(?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,coll.getId());
			stmt.setString(2, coll.getName());
			stmt.setString(3,coll.getCtype());
			stmt.setString(4,coll.getCity());
			stmt.setInt(5, coll.getFees());
			stmt.setInt(6, coll.getPcode());
			stmt.execute();
		System.out.println("Added successfully..");
		} catch (ClassNotFoundException e) {
			System.out.println("Jdbc driver not found..");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}
	}
	
