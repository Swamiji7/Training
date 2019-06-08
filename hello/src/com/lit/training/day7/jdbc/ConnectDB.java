package com.lit.training.day7.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			// loading the JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Establishing connection with the database
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "hr";
			String pass = "hr";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("System Connected Successfully");

		} catch (ClassNotFoundException e) {
			System.out.println("Jdbc Driver Not found");

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