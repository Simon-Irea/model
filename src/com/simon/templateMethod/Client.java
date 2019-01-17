package com.simon.templateMethod;

public class Client {

	public static void main(String[] args) {
		BankTemplateMethod btm = new DrawMoney();
		btm.process();
		
		//���������ڲ���
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ");
			}
		};
		
		btm2.process();
	}

}
