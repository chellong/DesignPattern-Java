package com.example.factory.simplefactory;

public class CarFactory1 {
	
	public static Car createCar(String type){
		if("Audi".equals(type)){
			return new Audi();
		}else if("Byd".equals(type)){
			return new Byd();
		}else{
			return null;
		}
	}

}
