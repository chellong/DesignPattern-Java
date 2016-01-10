package com.example.factory.abstractFactory;

public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySea();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}


}
