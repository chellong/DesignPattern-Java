package com.example.state;

/**
 * �������
 * 
 * @author ���ɵĺ���
 */
public class HomeContext {
	//���������ϵͳ�����Context������˺š����ݽ�ͬ���л���ͬ��״̬��
	
	private State state;
	
	public void setState(State s){
		System.out.println("�޸�״̬��");
		state = s;
		state.handle();
	}
	
}

