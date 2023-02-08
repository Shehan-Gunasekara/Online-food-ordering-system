package com.order;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class cardDBUtil {
	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean AddCard(String cusID,String number , String name , String date ,String cvv ) {
		isSuccess=false;
		
		try {
			con = DBConnect.getConnection();
			stmt= con.createStatement();
			String sql="insert into customercard values ('"+cusID+"','"+number+"','"+name+"','"+date+"','"+cvv+"')";
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
	
	public static List<customerCard>getCard(String id){
		ArrayList<customerCard> card = new ArrayList<>();
		
		try {
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "select * from customercard where cusID ='"+id+"'"; 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String cusID = rs.getString(1);
				String cardNumber = rs.getString(2);
				String holderName = rs.getString(3);
				String date =rs.getString(4);
				String cvv = rs.getString(5);
				
				customerCard CD = new customerCard(cusID,cardNumber,holderName,date,cvv);
				card.add(CD);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		return card;
		
	}
	
	public static boolean updateCard(String cusID,String number , String name , String date ,String cvv ) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update customercard set cardNumber='"+number+"' , holderName= '"+name+"' ,date='"+date+"' , cvv = '"+cvv+"' where cusID = '"+cusID+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess =true;
			}
			else {
				isSuccess=false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	} 
	
	
	public static boolean deleteCard(String cusID) {
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "delete from customercard where cusID = '"+cusID+"'";
			int r = stmt.executeUpdate(sql);
			
		
			
			if(r>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	
	
	
	

}
