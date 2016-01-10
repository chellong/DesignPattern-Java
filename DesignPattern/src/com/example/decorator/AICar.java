package com.example.decorator;

public class AICar extends SuperCar{

	public AICar(ICar icar) {
		super(icar);
	}

	public void auto(){
		System.out.println("×Ô¶¯¼ÝÊ»");
	}
	
	@Override
	public void move() {
		super.move();
		auto();
	}

}