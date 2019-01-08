package com.builder;

public class LowAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("����������");
		return new Engine("�Ͷ˷�����");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("���������");
		return new OrbitalModule("�Ͷ˹����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("�Ͷ�������");
	}

}
