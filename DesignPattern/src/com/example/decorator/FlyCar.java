package com.example.decorator;

public class FlyCar extends SuperCar{

	public FlyCar(ICar icar) {
		super(icar);
	}
	
	public void fly(){
		System.out.println("����");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}

}
