package com.example.factory.abstractFactory;

/**
 * 
 * 不可以增加产品，可以增加产品镞
 * 
 * @author 北飞的候鸟
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
