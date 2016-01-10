package com.example.factory.abstractFactory;

public interface Seat {
	
	void massage();

}

class LuxurySea implements Seat{

	@Override
	public void massage() {
		System.out.println("可以自动按摩");
	}
	
	
}

class LowSea implements Seat{

	@Override
	public void massage() {
		System.out.println("不能自动按摩");
	}
	
	
}
