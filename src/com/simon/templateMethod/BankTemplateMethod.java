package com.simon.templateMethod;

public abstract class BankTemplateMethod {

	public void takeNumber() {
		System.out.println("");
	}
	
	public abstract void transact();//template method
	
	public void evaluate() {
		System.out.println("");
	}
	//template method
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}

}
