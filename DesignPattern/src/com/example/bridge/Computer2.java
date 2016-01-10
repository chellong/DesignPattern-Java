package com.example.bridge;

public class Computer2 {

	protected  Brand brand;
	
	public Computer2(Brand brand) {
		this.brand = brand;
	}
	
	public void sale(){
		brand.sale();
	}
}

class LapTop2 extends Computer2{

	public LapTop2(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("DeskTop");
	}
	
}
