package com.example.single;

/**
 * 
 * ���Զ�ʽ����ģʽ
 * 
 * ����Ƶ��
 * 
 * �̰߳�ȫ������Ҫ����ͬ���飬����Ч�ʸ�
 * 
 * @author ���ɵĺ���
 *
 */
public class SingletonDemo1 {
	
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1(){
		
	}
	
	public static SingletonDemo1 getInstance(){
		return instance;
	}

}