package com.chainOfResp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader c = new GeneralManager("����");
		//��֯����������Ĺ�ϵ
		a.setNextLeader(b);
		b.setNextLeader(c);
		//��ʼ��ٲ���
		LeaveRequest req1 = new LeaveRequest("TOM", 5, "�ؼ�");
		a.handleRequest(req1);
	}

}
