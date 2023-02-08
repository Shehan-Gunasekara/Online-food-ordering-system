package com.order;

public class menu {
   private   String name;
	private String id;
	private String picName;
	private String sellerID;
	private double price;
	private String description;
	private String category;

	public menu(String name, String id, String picName, String sellerID, double price, String description,
			String category) {
		super();
		this.name = name;
		this.id = id;
		this.picName = picName;
		this.sellerID = sellerID;
		this.price = price;
		this.description = description;
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public String getid() {
		return id;
	}
	public String getPicName() {
		return picName;
	}
	public String getSellerID() {
		return sellerID;
	}
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}

	
	
}
