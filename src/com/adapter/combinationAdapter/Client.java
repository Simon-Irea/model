package com.adapter.combinationAdapter;

public class Client {
	
	public static void main(String[] args) {
		Adaptee a = new Adaptee();
		Target t = new Adapter(a);
		t.handleReq();
		
	}

}
