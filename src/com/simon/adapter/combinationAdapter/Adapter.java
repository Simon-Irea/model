package com.simon.adapter.combinationAdapter;

/**
 * ÊÊÅäÆ÷±¾Éí
 * @author Administrator
 *
 */
public class Adapter implements Target {
	
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
