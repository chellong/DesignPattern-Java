package com.example.bulider;

/**
 * 使用场景
 * StringBuilder类的append方法
 * SQL中的PreparedStatement
 * JDOM中，DomBuilder，SAXBuilder
 * 
 * @author 北飞的候鸟
 *
 */
public class BuliderClient {
	
	public static void main(String[] args) {
		
		AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());
		AirShip ship = director.directorAirShip();
		ship.launch();
		System.out.println(ship.toString());
	}

}
