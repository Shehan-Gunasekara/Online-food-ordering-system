package com.order;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class menuDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<menu>getMenu(){
		ArrayList<menu> men = new ArrayList<>();
		
		try {
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "select * from menu"; 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String Name = rs.getString(1);
				String ID = rs.getString(2);
				String SellerID = rs.getString(3);
				String PicName =rs.getString(4);
				double price = rs.getDouble(5);
				String description = rs.getString(6);
				String category = rs.getString(7);
				
				
			   
				menu FD = new menu(Name,ID,PicName,SellerID,price,description,category);
				men.add(FD);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		return men;
		
	}
	
	public static List<menu>getBreakFastMenu(){
		ArrayList<menu> breakfastmen = new ArrayList<>();
		
		try {
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			String cat = "Breakfast";
			String sql = "select * from menu where category ='"+cat+"'"; 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String Name = rs.getString(1);
				String ID = rs.getString(2);
				String SellerID = rs.getString(3);
				String PicName =rs.getString(4);
				double price = rs.getDouble(5);
				String description = rs.getString(6);
				String category = rs.getString(7);
				
							   
				menu BM = new menu(Name,ID,PicName,SellerID,price,description,category);
				breakfastmen.add(BM);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		return breakfastmen;
		
	}
	
	public static List<menu>getlunchMenu(){
		ArrayList<menu> lunchmen = new ArrayList<>();
		
		try {
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			String cat = "Lunch";
			String sql = "select * from menu where category ='"+cat+"'"; 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String Name = rs.getString(1);
				String ID = rs.getString(2);
				String SellerID = rs.getString(3);
				String PicName =rs.getString(4);
				double price = rs.getDouble(5);
				String description = rs.getString(6);
				String category = rs.getString(7);
				
							   
				menu LM = new menu(Name,ID,PicName,SellerID,price,description,category);
				lunchmen.add(LM);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		return lunchmen;
		
	}
	
	public static List<menu>getDinnerMenu(){
		ArrayList<menu> Dinnermen = new ArrayList<>();
		
		try {
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			String cat = "Dinner";
			String sql = "select * from menu where category ='"+cat+"'"; 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String Name = rs.getString(1);
				String ID = rs.getString(2);
				String SellerID = rs.getString(3);
				String PicName =rs.getString(4);
				double price = rs.getDouble(5);
				String description = rs.getString(6);
				String category = rs.getString(7);
				
							   
				menu DM = new menu(Name,ID,PicName,SellerID,price,description,category);
				Dinnermen.add(DM);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		return Dinnermen;
		
	}
}
