package com.builder;

public class LowAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机");
		return new Engine("低端发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("低端轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("低端逃逸塔");
	}

}
