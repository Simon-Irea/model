package com.simon.adapter.defaultAdapter;

public class Client {
	
	public static void main(String[] args) {
		//�������������
		Adaptee a = new Adaptee();
		//���������������
		Adapter t = new RealAdapter(a);
		//ִ������ķ���
		t.eat();
	}

}
