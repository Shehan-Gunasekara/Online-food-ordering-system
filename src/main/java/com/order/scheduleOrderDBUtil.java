package com.order;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class scheduleOrderDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean Addscheduleorder(String cussID ,String schedule) {
		isSuccess=false;
		
		try {
			con = DBConnect.getConnection();
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			String stat="paid";
			String cus="adas";
			String text="adf";
			stmt= con.createStatement();
			String sql="insert into orders(cusID,statuss,dates,scheduleTime) values ('"+cussID+"','"+stat+"','"+timeStamp+"','"+schedule+"')";
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
