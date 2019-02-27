package com.simon.adapter.combinationAdapter;

/**
 * 适配器本身
 * @author Administrator
 *
 */
public class Adapter implements Target {
	//使用组合的方式，将需要适配的类注入进来，该对象可以表示一个抽象类，也可以表示一个接口
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public Adaptee getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {
		adaptee.request();
	}

}
