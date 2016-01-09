package com.example.singlemode;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ��������ʽ����ģʽ(��η�ֹ����ͷ����л�©��)
 * @author ���ɵĺ���
 */
public class SingletonDemo6 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//���ʼ��ʱ������ʼ�����������ʱ���أ������õ�ʱ���ٴ�������
	private static SingletonDemo6 instance;  
	
	/**
	 * ��ε��õ�ʱ��ͨ���׳��쳣��ֹͣ����
	 */
	private SingletonDemo6(){ //˽�л�������
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	//����ͬ��������Ч�ʵͣ�
	public static  synchronized SingletonDemo6  getInstance(){
		if(instance==null){
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ��󡣶�����Ҫ�����ٴ����¶���
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
}