package com.example.factory.abstractFactory;

/**
 * 
 * ���������Ӳ�Ʒ���������Ӳ�Ʒ��
 * 
 * @author ���ɵĺ���
 *
 */
public class AbsFactoryClient1 {

	public static void main(String[] args) {
	
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		
		e.run();
		e.start();
	}
}
