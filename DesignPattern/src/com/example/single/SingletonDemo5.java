package com.example.single;
/**
 * 测试枚举式实现单例模式(没有延时加载)
 * 枚举本身就是单利
 * 可以避免反射和反序列化调用
 * @author 北飞的候鸟
 *
 */
public enum SingletonDemo5 {

	//这个枚举元素，本身就是单例对象！
	INSTANCE;
	
	//添加自己需要的操作！
	public void singletonOperation(){
		
	}

}
