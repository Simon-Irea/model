package com.simon.decorator;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		
		WaterCar watercar = new WaterCar(car);
		watercar.move();
		
		AICar aicar = new AICar(watercar);
		aicar.move();
	}

}
