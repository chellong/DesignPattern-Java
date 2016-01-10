package com.example.single;

/**
 * 
 * ��������ʽ����ģʽ���ӳټ���
 * 
 * 
 * @author ���ɵĺ���
 *
 */
public class SingletonDemo2 {
	
	private static SingletonDemo2 instance ;
	
	private SingletonDemo2(){
		
	}
	
	/**
	 * ����Ч��
	 * 
	 * δͬ��
	 * @return
	 */
	public static SingletonDemo2 getInstance(){
		if(instance == null)
			instance = new SingletonDemo2();
		return instance;
	}
	/**
	 * ͬ��
	 * @return
	 */
	public static  synchronized SingletonDemo2 getSyncInstance(){
		if(instance == null)
			instance = new SingletonDemo2();
		return instance;
	}

}
