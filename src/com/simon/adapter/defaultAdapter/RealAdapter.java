package com.simon.adapter.defaultAdapter;

/**
 * �����������
 * @author simon
 *
 */
public class RealAdapter extends Adapter{
	//ʹ����ϵķ�ʽ������Ҫ�������ע��������ö�����Ա�ʾһ�������࣬Ҳ���Ա�ʾһ���ӿ�
	private Adaptee adaptee;

	public RealAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public Adaptee getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void eat() {

		adaptee.request();
	}

}
