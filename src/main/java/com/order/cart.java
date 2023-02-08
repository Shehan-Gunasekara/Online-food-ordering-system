package com.order;

public class cart {
	private int CID;
	private String prodctID;
	private String productName;
	private String customerID;
	private int quantity;
	public int price;

	
	
	public cart(int cID, String prodctID, String productName, String customerID, int quantity, int price) {
		super();
		CID = cID;
		this.prodctID = prodctID;
		this.productName = productName;
		this.customerID = customerID;
		this.quantity = quantity;
		this.price = price;
	}
	public int getCID() {
		return CID;
	}
	public String getProdctID() {
		return prodctID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getProductName() {
		return productName;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	
	
}
