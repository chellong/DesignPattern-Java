package com.example.bulider;

/**
 * 装配者
 * 
 * @author 北飞的候鸟
 *
 */
public class SxtAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;
	
	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directorAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModel o = builder.builderOrbitalModel();
		EscapeTower et = builder.builderEscapeTower();
		
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModel(o);
		
		return ship;
	}

}
