package com.example.prototype;

import java.util.Date;

/**
 * ����ԭ��ģʽ��ǳ��¡��
 * @author ���ɵĺ���
 *
 */
public class PrototypeClient1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep s = new Sheep("",new Date());
		System.out.println(s);
		
		Sheep sheepClond = (Sheep) s.clone();
		
		
		s.setBirthday(new Date(1212121212));
		System.out.println(sheepClond);
	}

}