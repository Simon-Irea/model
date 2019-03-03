package com.simon.adapter.objectAdapter;

public class Client {
	
	public static void main(String[] args) {
		//创建被适配的类
		Adaptee a = new Adaptee();
		//创建该类的适配器
		Target t = new Adapter(a);
		//执行适配的方法
		t.handleReq();
	}

}
