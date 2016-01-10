package com.example.chainofresponsibility;

public class ChainClient {
	
	public static void main(String[] args) {
		
		//�쵼
		Leader a = new Director("A");
		Leader b = new Manager("B");
		Leader c = new GeneralManager("C");
		//���¼���ϵ
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		//��ʼ���
		LeaveRequest lr = new LeaveRequest("Tom", 2, "���Ÿ�������ˮ�����֣�һ��Ѿͷ����ϴ������"
				+ "�����ȥ����������֣�"
				+ "�Ҳ���ȥ����������֡�");
		a.handleRequest(lr);
		
		
	}

}