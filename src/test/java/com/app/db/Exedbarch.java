package com.app.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Exedbarch  {
	public static void main(String[] args) {
		
		try {
			ResultSet rs=Db_ArchReuse.Db_read(Constant.city);
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
