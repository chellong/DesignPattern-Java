package com.example.chainofresponsibility;

public class Manager extends Leader{

	
	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getLeaveDay() < 30){
			System.out.println(this.name + "--- ��׼");
			System.out.println("Ա����--"+lr.getName() +" ��٣�--"+ lr.getLeaveDay()
			+"ԭ�� --"+lr.getReson());
		}else{
			System.out.println("Ī��" + lr.getName() + "���ְ��" + "��Ȼ���" + lr.getLeaveDay() +"��");
		}
	}

}