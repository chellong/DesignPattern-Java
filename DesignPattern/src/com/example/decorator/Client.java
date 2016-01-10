package com.example.decorator;

/**
 * ×°ÅäÄ£Ê½
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("*******************************");
		
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		System.out.println("*******************************");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println("*******************************");
		WaterCar waterAndFlyCar = new WaterCar(flyCar);
		waterAndFlyCar.move();
		
	}
}
