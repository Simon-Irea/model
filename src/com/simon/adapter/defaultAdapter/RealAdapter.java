package com.simon.adapter.defaultAdapter;

/**
 * 具体的适配器
 * @author simon
 *
 */
public class RealAdapter extends Adapter{
	//使用组合的方式，将需要适配的类注入进来，该对象可以表示一个抽象类，也可以表示一个接口
	private Adaptee adaptee;

	public RealAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public Adaptee getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void eat() {

		adaptee.request();
	}

}
