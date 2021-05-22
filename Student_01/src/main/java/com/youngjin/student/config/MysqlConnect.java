package com.youngjin.student.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {

	private static Connection dbConn;
	
	static { 
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/studentinfo";
		String name = "stUser";
		String pw = "1234";
		
		try {
			Class.forName(driver);
			
			if(dbConn == null) {
				
				dbConn = DriverManager.getConnection(url, name, pw);
				
			}
			
			System.out.println("MySQL 접속완료!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getDBC() {
		
		return dbConn;
	}
	
}
