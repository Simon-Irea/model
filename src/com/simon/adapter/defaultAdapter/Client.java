package com.simon.adapter.defaultAdapter;

public class Client {
	
	public static void main(String[] args) {
		//创建被适配的类
		Adaptee a = new Adaptee();
		//创建该类的适配器
		Adapter t = new RealAdapter(a);
		//执行适配的方法
		t.eat();
	}

}
