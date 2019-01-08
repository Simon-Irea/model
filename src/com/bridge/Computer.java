package com.bridge;
/**
 * 定义电脑的接口，应为子类需要使用共同的属性，所以定义一个抽象类
 * @author simon
 *
 */
public abstract class Computer {
	protected Brand brand;

	public Computer(Brand brand) {
		this.brand = brand;
	}
	public void sale() {
		brand.sale();
	}
}
class Desktop extends Computer {

	public Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("台式机");
	}
	
}

class Laptop extends Computer {

	public Laptop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("笔记本");
	}
	
}
