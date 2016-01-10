package com.example.decorator;

public class WaterCar extends SuperCar{

	public WaterCar(ICar icar) {
		super(icar);
	}

	
	public void swim(){
		System.out.println("к╝ио");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}

}

