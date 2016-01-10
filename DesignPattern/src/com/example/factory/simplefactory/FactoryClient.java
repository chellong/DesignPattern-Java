package com.example.factory.simplefactory;

public class FactoryClient {
	
	public static void main(String[] args) {
		
		Car c1 = CarFactory1.createCar("Audi");
		Car c2 = CarFactory1.createCar("Byd");
		
		c1.run();
		c2.run();
	}

}
