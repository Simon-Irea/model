package com.simon.bridge;

public class Client {

	public static void main(String[] args) {
		//��������ıʼǱ�����
		Computer c = new Laptop(new Lenovo());
		c.sale();
	}

}
