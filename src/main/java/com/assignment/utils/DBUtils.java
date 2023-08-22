package com.assignment.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	
	public static Connection getConnection( )  {
		
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra_jdbc", "root", "Anmol@1234");

			return conn;
		}
		catch (Exception e) {
			System.out.println("Inside catch of getConnection()...");
			e.printStackTrace();
		}
		
		return conn;
	}
}
