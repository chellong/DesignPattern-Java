package com.example.factory.abstractFactory;

public interface Seat {
	
	void massage();

}

class LuxurySea implements Seat{

	@Override
	public void massage() {
		System.out.println("�����Զ���Ħ");
	}
	
	
}

class LowSea implements Seat{

	@Override
	public void massage() {
		System.out.println("�����Զ���Ħ");
	}
	
	
}