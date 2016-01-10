package com.example.single;

/**
 * 
 * 测试懒汉式单利模式，延迟加载
 * 
 * 
 * @author 北飞的候鸟
 *
 */
public class SingletonDemo2 {
	
	private static SingletonDemo2 instance ;
	
	private SingletonDemo2(){
		
	}
	
	/**
	 * 调用效率
	 * 
	 * 未同步
	 * @return
	 */
	public static SingletonDemo2 getInstance(){
		if(instance == null)
			instance = new SingletonDemo2();
		return instance;
	}
	/**
	 * 同步
	 * @return
	 */
	public static  synchronized SingletonDemo2 getSyncInstance(){
		if(instance == null)
			instance = new SingletonDemo2();
		return instance;
	}

}
