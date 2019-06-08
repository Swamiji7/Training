package com.lit.training.day7.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Dao-Data Access Object
/*
 * TODO:
 * create table TBL_PRODUCT(
 * id number(5) primary key,
 * name varchar2(50),
 * price number(12,2),
 * quantity number(5)) 
 *  
 */
public class ProductDao {

	// public void add(int id, String name, double price, int quantity) {
	public void add(Product product) {
		Connection conn = null; // helps the connection between the app
		PreparedStatement stmt = null; // helps us to execute SQL Statements
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

			String sql = "insert into TBL_PRODUCT values(?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, product.getId());
			stmt.setString(2, product.getName());
			stmt.setDouble(3, product.getPrice());
			stmt.setInt(4, product.getQuantity());
			stmt.executeUpdate();
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
