package com.example.facade;

/**
 * 
 * 外观模式
 * 
 * @author 北飞的候鸟
 *
 */
public class Client1 {
	
	public static void main(String[] args) {
		
		new RegisterFacade().register();
		
	}
}
