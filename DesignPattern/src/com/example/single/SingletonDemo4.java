package com.example.single;

/**
 * 
 * 静态内部类实现方式
 * 线程安全，懒加载
 * 调用效率高
 * 
 * @author 北飞的候鸟
 *
 */
public class SingletonDemo4 {

	private static class SingletonClassInstance {
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	//方法没有同步，调用效率高！
	public static SingletonDemo4  getInstance(){
		return SingletonClassInstance.instance;
	}
	
	private SingletonDemo4(){
	}

}
