package com.example.strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("��8.5��");
		return standardPrice * 0.85;
	}

}
