package com.simon.templateMethod;

public class Client {

	public static void main(String[] args) {
		BankTemplateMethod btm = new DrawMoney();
		btm.process();
		
		//
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("");
			}
		};
		
		btm2.process();
	}

}
