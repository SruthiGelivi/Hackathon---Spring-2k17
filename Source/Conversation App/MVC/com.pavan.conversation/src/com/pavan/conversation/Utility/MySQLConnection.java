package com.pavan.conversation.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnection {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 } catch (ClassNotFoundException e) {			
			e.printStackTrace();
		  }
		}
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:8090/demodatabase","root","root123");
	}
}
