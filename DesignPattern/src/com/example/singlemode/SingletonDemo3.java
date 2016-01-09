package com.example.singlemode;

/**
 * 
 * ˫�ؼ�⣨ż���������,�����hʹ�ã�
 * 
 * 
 * @author ���ɵĺ���
 *
 */
public class SingletonDemo3 {

	private static SingletonDemo3 instance;

	private SingletonDemo3() {

	}

	public static SingletonDemo3 getInstance() {
		
		if(instance == null){
			SingletonDemo3 sc;
			synchronized(SingletonDemo3.class){
				sc = instance;
				if (sc == null) {
					synchronized (SingletonDemo3.class) { // 1
						if (sc == null) // 2
							sc = new SingletonDemo3(); // 3
				}
			}
				instance = sc;
			}
		}
		return instance;
	}

}