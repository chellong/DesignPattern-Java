package com.example.chainofresponsibility;

public class GeneralManager extends Leader{

	
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getLeaveDay() < 10){
			System.out.println(this.name + "--- 批准");
			System.out.println("员工：--"+lr.getName() +" 请假：--"+ lr.getLeaveDay()
			+"原因 --"+lr.getReson());
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(lr);
			}
		}
	}

}
