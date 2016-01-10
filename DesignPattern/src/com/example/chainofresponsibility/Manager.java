package com.example.chainofresponsibility;

public class Manager extends Leader{

	
	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getLeaveDay() < 30){
			System.out.println(this.name + "--- 批准");
			System.out.println("员工：--"+lr.getName() +" 请假：--"+ lr.getLeaveDay()
			+"原因 --"+lr.getReson());
		}else{
			System.out.println("莫非" + lr.getName() + "想辞职？" + "居然请假" + lr.getLeaveDay() +"天");
		}
	}

}
