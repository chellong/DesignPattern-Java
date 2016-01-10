package com.example.bridge;

public class Client {
	
	public static void main(String[] args) {
		Computer2 c = new LapTop2(new Lenovo());
		c.sale();
	}

}
