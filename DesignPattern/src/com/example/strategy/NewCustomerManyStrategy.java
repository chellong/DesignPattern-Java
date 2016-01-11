package com.example.strategy;

public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("Дђ9ел");
		return standardPrice * 0.9;
	}

}
