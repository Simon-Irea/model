package com.simon.adapter.objectAdapter;

public class Client {
	
	public static void main(String[] args) {
		//�������������
		Adaptee a = new Adaptee();
		//���������������
		Target t = new Adapter(a);
		//ִ������ķ���
		t.handleReq();
	}

}
