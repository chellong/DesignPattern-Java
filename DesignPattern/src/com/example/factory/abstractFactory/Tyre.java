package com.example.factory.abstractFactory;

public interface Tyre {

	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("����̥");
	}
	
}

class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("������");
	}
	
}
