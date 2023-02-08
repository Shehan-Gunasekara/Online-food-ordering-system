package com.order;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class orderDBUtil {
	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean Addorder(String cussID) {
		isSuccess=false;
		
		try {
			con = DBConnect.getConnection();
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			String stat="paid";
			stmt= con.createStatement();
			String sql="insert into orders(cusID,statuss,dates) values ('"+cussID+"','"+stat+"','"+timeStamp+"')";
			int rs =stmt.executeUpdate(sql);
			
			if(rs> 0) {
				isSuccess = true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}

}
