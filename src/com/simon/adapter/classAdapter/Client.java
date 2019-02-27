package com.simon.adapter.classAdapter;

public class Client {
	
	public static void main(String[] args) {
		//创建一个适配器
		Target t = new Adapter();
		//通过适配器的方法，可以访问到目标方法
		t.handleReq();
	}

}
