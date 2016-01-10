package com.example.prototype;

import java.io.IOException;

/**
 * 
 * 使用序列化和反序列化深复制
 * 
 * @author 北飞的候鸟
 *
 */

@SuppressWarnings("all")
public class PrototypeClient4 {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		//testNew(1000);
		testClone(1000);

	}

	private static void testClone(int size) throws CloneNotSupportedException {

		// 10286
		long start = System.currentTimeMillis();
		
		Laptop t = new Laptop();
		
		for (int i = 0; i < 1000; i++) {
			Laptop temp = (Laptop) t.clone();
			System.out.println(temp);
		}

		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}

	private static void testNew(int size) {

		// 10286
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++) {
			Laptop t = new Laptop();
			System.out.println(t);
		}

		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}

}

/**
 * 
 * 测试创建对象的时候比较耗时的时候
 * 短时间内创建大量对象
 * 
 * @author 北飞的候鸟
 *
 */
class Laptop implements Cloneable {
	
	public Laptop() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
