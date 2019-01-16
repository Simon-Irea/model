package com.strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("Дђ8.5ел");
		return standardPrice*0.85;
	}

}
