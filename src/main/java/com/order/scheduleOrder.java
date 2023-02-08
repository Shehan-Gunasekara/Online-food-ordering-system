package com.order;

public class scheduleOrder extends order {
	
	private String scheduleTime;


	public scheduleOrder(int orderID, String cusID, String status, String date,String scheduleTime) {
		super(orderID, cusID, status, date);
		this.scheduleTime=scheduleTime;
		// TODO Auto-generated constructor stub
	}



	public String getScheduleTime() {
		return scheduleTime;
	}

}
