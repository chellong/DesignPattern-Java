package com.example.decorator;

public class AICar extends SuperCar{

	public AICar(ICar icar) {
		super(icar);
	}

	public void auto(){
		System.out.println("�Զ���ʻ");
	}
	
	@Override
	public void move() {
		super.move();
		auto();
	}

}