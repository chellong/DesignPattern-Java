package com.example.state;

/**
 * ��Ԥ��״̬
 *
 *@author ���ɵĺ���
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("������Ԥ�������˲��ܶ���");
	}

}