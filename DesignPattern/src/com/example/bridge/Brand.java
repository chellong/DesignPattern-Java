package com.example.bridge;

public interface Brand {
	
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("Lenovo");
	}
	
}

class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("Dell");
	}
	
}

class ShenZhou implements Brand{

	@Override
	public void sale() {
		System.out.println("ShenZhou");
	}
	
}
