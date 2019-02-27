package com.simon.adapter.combinationAdapter;

/**
 * ����������
 * @author Administrator
 *
 */
public class Adapter implements Target {
	//ʹ����ϵķ�ʽ������Ҫ�������ע��������ö�����Ա�ʾһ�������࣬Ҳ���Ա�ʾһ���ӿ�
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public Adaptee getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handleReq() {
		adaptee.request();
	}

}
