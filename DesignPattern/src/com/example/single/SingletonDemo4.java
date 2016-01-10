package com.example.single;

/**
 * 
 * ��̬�ڲ���ʵ�ַ�ʽ
 * �̰߳�ȫ��������
 * ����Ч�ʸ�
 * 
 * @author ���ɵĺ���
 *
 */
public class SingletonDemo4 {

	private static class SingletonClassInstance {
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	//����û��ͬ��������Ч�ʸߣ�
	public static SingletonDemo4  getInstance(){
		return SingletonClassInstance.instance;
	}
	
	private SingletonDemo4(){
	}

}
