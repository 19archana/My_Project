package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_ArchReuse {
	
	public static Connection db_conn() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","archana@19");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
public static ResultSet Db_read(String query) {
		ResultSet rs=null;
		try {
			Connection conn=db_conn();
			Statement st=conn.createStatement();
			rs=st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;		
	}
public static void db_createandmodify(String query) {
	try {
		Connection conn=db_conn();
		Statement st=conn.createStatement();
		boolean execute=st.execute(query);
		System.out.println("execute");		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
