package com.example.bulider;

public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("bulider");
		return new Engine("Engine");
	}

	@Override
	public OrbitalModel builderOrbitalModel() {
		System.out.println("bulider");
		return new OrbitalModel("OrbitalModel");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("bulider");
		return new EscapeTower("EscapeTower");
	}
}
