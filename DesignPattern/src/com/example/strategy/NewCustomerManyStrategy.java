package com.example.strategy;

public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("��9��");
		return standardPrice * 0.9;
	}

}
