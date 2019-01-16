package com.strategy;
/**
 * ����;���Ĳ����ཻ��
 * �����Ļ���������㷨��ֱ�ӵĿͻ����÷����ˣ�ʹ���㷨���Զ����ڿͻ��˶����ı仯
 * ���ʹ��Spring������ע�빦�ܣ�������ͨ�������ļ�����̬��ע�벻ͬ���Զ��󣬶�̬���л���ͬ���㷨
 * @author simon
 *
 */
public class Context {
	private Strategy strategy; //��ǰ���õ��㷨����
	//����ͨ����Ӧ�Ĺ�������ע��
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void pringPrice(double s) {
		System.out.println("���ñ���"+ strategy.getPrice(s));
	}
	
}
