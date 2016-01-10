package com.example.chainofresponsibility;

public class LeaveRequest {

	private String name;
	private int leaveDay;
	private String reson;
	
	public LeaveRequest() {
		super();
	}
	
	
	public LeaveRequest(String name, int leaveDay, String reson) {
		super();
		this.name = name;
		this.leaveDay = leaveDay;
		this.reson = reson;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getLeaveDay() {
		return leaveDay;
	}
	
	
	public void setLeaveDay(int leaveDay) {
		this.leaveDay = leaveDay;
	}
	
	
	public String getReson() {
		return reson;
	}
	
	
	public void setReson(String reson) {
		this.reson = reson;
	}
	
	
}
