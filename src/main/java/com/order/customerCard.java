package com.order;

public class customerCard {
	private String cusID;
	private String cardNumber;
	private String holderName;
	private String date;
	private String cvv;
	public customerCard(String cusID, String cardNumber, String holderName, String date, String cvv) {
		super();
		this.cusID = cusID;
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.date = date;
		this.cvv = cvv;
	}
	public String getCusID() {
		return cusID;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public String getDate() {
		return date;
	}
	public String getCvv() {
		return cvv;
	}
	
	

}
