package com.simon.templateMethod;

public abstract class BankTemplateMethod {
	//���巽��
	public void takeNumber() {
		System.out.println("ȡ���Ŷ�");
	}
	
	public abstract void transact();//���ӷ��� ��������ҵ�� 
	
	public void evaluate() {
		System.out.println("��������");
	}
	//ʹ��final�ؼ��֣�����������д�÷���
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}

}
