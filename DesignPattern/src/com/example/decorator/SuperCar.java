package com.example.decorator;

public class SuperCar implements ICar{

	private ICar icar;

	public SuperCar(ICar icar) {
		super();
		this.icar = icar;
	}



	@Override
	public void move() {
		icar.move();
	}

}
