package com.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	

		private Connection connection;
		
		DBCon(String driver,String url,String username,String password) throws ClassNotFoundException,SQLException
		{
			Class.forName(driver);
			connection=DriverManager.getConnection(url,username,password);
		}

		public Connection getConnection() {
			return connection;
		}
		
		public void closeConnection()
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

