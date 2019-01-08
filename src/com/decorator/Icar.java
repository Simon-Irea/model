package com.decorator;
/**
 * �������
 * @author Administrator
 *
 */
public interface Icar {
	void move();
}
/**
 * ���幹������
 * @author Administrator
 *
 */
class Car implements Icar {

	@Override
	public void move() {
		System.out.println("½������");
	}
	
}
/**
 * decoratorװ����
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
 * ����װ�ν�ɫ
 * @author Administrator
 *
 */
class FlyCar extends SuperCar {

	public FlyCar(Icar car) {
		super(car);
	}
	
	public void fly() {
		System.out.println("���Ϸ�");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
	
	
}

/**
 * ����װ�ν�ɫ
 * @author Administrator
 *
 */
class WaterCar extends SuperCar {

	public WaterCar(Icar car) {
		super(car);
	}
	
	public void swim() {
		System.out.println("ˮ����");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
	
	
}

/**
 * ����װ�ν�ɫ
 * @author Administrator
 *
 */
class AICar extends SuperCar {

	public AICar(Icar car) {
		super(car);
	}
	
	public void autoMove() {
		System.out.println("�Զ���");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}
	
	
}
