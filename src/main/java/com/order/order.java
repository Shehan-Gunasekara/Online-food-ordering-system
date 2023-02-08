package com.order;

public class order {
	private int orderID;
	private String cusID;
	private String status;
	private String date;
	public order(int orderID, String cusID, String status, String date) {
		super();
		this.orderID = orderID;
		this.cusID = cusID;
		this.status = status;
		this.date = date;
	}
	
	public order() {
		
	}
	
	public int getOrderID() {
		return orderID;
	}
	public String getCusID() {
		return cusID;
	}
	public String getStatus() {
		return status;
	}
	public String getDate() {
		return date;
	}
	
	

}
