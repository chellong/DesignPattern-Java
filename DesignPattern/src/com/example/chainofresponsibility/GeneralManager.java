package com.example.chainofresponsibility;

public class GeneralManager extends Leader{

	
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getLeaveDay() < 10){
			System.out.println(this.name + "--- ��׼");
			System.out.println("Ա����--"+lr.getName() +" ��٣�--"+ lr.getLeaveDay()
			+"ԭ�� --"+lr.getReson());
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(lr);
			}
		}
	}

}
