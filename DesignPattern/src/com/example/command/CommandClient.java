package com.example.command;

/**
 * ������ģʽ�����ݿ�����
 * 
 * @author ���ɵĺ���
 *
 */
public class CommandClient {

	public static void main(String[] args) {
		
		Invoke i = new Invoke(new ConcreateCommand(new Receiver()));
		i.call();
	}
}
