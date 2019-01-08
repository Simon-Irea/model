package com.decorator;
/**
 * 抽象组件
 * @author Administrator
 *
 */
public interface Icar {
	void move();
}
/**
 * 具体构建对象
 * @author Administrator
 *
 */
class Car implements Icar {

	@Override
	public void move() {
		System.out.println("陆地上抛");
	}
	
}
/**
 * decorator装饰器
 * @author Administrator
 *
 */
abstract class SuperCar implements Icar {

	protected Icar car;
	
	
	public SuperCar(Icar car) {
		super();
		this.car = car;
	}


	@Override
	public void move() {
		car.move();
	}
	
}
/**
 * 具体装饰角色
 * @author Administrator
 *
 */
class FlyCar extends SuperCar {

	public FlyCar(Icar car) {
		super(car);
	}
	
	public void fly() {
		System.out.println("天上飞");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
	
	
}

/**
 * 具体装饰角色
 * @author Administrator
 *
 */
class WaterCar extends SuperCar {

	public WaterCar(Icar car) {
		super(car);
	}
	
	public void swim() {
		System.out.println("水中游");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
	
	
}

/**
 * 具体装饰角色
 * @author Administrator
 *
 */
class AICar extends SuperCar {

	public AICar(Icar car) {
		super(car);
	}
	
	public void autoMove() {
		System.out.println("自动跑");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}
	
	
}
