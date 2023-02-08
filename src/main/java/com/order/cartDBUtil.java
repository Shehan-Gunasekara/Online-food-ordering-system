package com.order;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class cartDBUtil {
	

	

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean AddCart(String cusID ,String productName, String productID , int QTY ,double price ) {
		isSuccess=false;
		
		try {
			con = DBConnect.getConnection();
			stmt= con.createStatement();
			int aa=02;
			String sql="insert into cart(productID,productName,customerID,quantity,price) values ('"+productID+"','"+productName+"','"+cusID+"','"+QTY+"','"+price+"')";
			int rs =stmt.executeUpdate(sql);
		     System.out.println(rs);
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
	
	public static List<cart>getCart(String cusID){
		ArrayList<cart> orderCart = new ArrayList<>();
		
		try {
			con =DBConnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "select * from cart where customerID ='"+cusID+"'"; 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int CID = rs.getInt(1);
				String productID = rs.getString(2);
				String productName = rs.getString(3);
				String customerID =rs.getString(4);
				int quantity = rs.getInt(5);
				int price = rs.getInt(6);
				
				
				
				cart ct = new cart(CID,productID,productName,customerID,quantity,price);
				orderCart.add(ct);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		return orderCart;
		
	}
	
	public static boolean deleteCart(String id) {
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "delete from cart where CID ='"+id+"'";
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
	
	public static boolean deleteAllCart(String id) {
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "delete from cart where customerID ='"+id+"'";
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
