package com.example.prototype;

import java.util.Date;

/**
 * 测试原型模式（深克隆）
 * @author 北飞的候鸟
 *
 */
public class PrototypeClient2 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep s = new Sheep("哈哈",new Date());
		System.out.println(s);
		
		Sheep sheepClond = (Sheep) s.clone();
		
		
		s.setBirthday(new Date(1212121212));
		System.out.println(sheepClond);
	}

}
