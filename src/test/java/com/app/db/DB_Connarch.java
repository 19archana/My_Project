package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connarch {
 public static void main(String[] args) {
	 db_Conn();
	 
 }
	public static void db_Conn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb", "root", "archana@19");
			Statement st = conn.createStatement();
			String query = "Select * from TestDB.PersonDetails";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}


	
