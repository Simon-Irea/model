package com.builder;

public class LowAirShipDirector implements AirShipDirector {
	
	private AirShipBuilder builder;
	
	public LowAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		
		Engine e = builder.builderEngine();
		OrbitalModule oe = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		AirShip as = new AirShip();
		as.setEngine(e);
		as.setEscapeTower(et);
		as.setOrbitalModule(oe);
		
		return as;
	}
}
