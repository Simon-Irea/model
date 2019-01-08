package com.builder;

public class Client {

	public static void main(String[] args) {
		AirShipDirector director = new LowAirShipDirector(new LowAirShipBuilder());
		AirShip ship = director.directAirShip();
		System.out.println(ship.toString());
	}

}
