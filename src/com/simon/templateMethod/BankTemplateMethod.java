package com.simon.templateMethod;

public abstract class BankTemplateMethod {
	//具体方法
	public void takeNumber() {
		System.out.println("取号排队");
	}
	
	public abstract void transact();//钩子方法 办理具体的业务 
	
	public void evaluate() {
		System.out.println("反馈评分");
	}
	//使用final关键字，避免子类重写该方法
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}

}
