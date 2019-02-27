package com.simon.adapter.classAdapter;

/**
 * ÊÊÅäÆ÷±¾Éí
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target {
	
	@Override
	public void handleReq() {
		super.request();
	}

}
