package com.example.bulider;

/**
 * 建造者模式
 * 
 * @author 北飞的候鸟
 *
 */
public class AirShip {
	
	private OrbitalModel orbitalModel;
	private Engine engine;
	private EscapeTower escapeTower;
	
	
	public AirShip() {
	}
	
	public void launch(){
		
	}
	
	public OrbitalModel getOrbitalModel() {
		return orbitalModel;
	}


	public void setOrbitalModel(OrbitalModel orbitalModel) {
		this.orbitalModel = orbitalModel;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public EscapeTower getEscapeTower() {
		return escapeTower;
	}


	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}


	@Override
	public String toString() {
		return "AirShip [orbitalModel=" + orbitalModel + ", engine=" + engine + ", escapeTower=" + escapeTower + "]";
	}
}
