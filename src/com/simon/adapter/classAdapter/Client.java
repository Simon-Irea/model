package com.simon.adapter.classAdapter;

public class Client {
	
	public static void main(String[] args) {
		//����һ��������
		Target t = new Adapter();
		//ͨ���������ķ��������Է��ʵ�Ŀ�귽��
		t.handleReq();
	}

}
