package com.chainOfResp;

public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println("Ա������:" + request.getEmpName() + "�������:" + request.getLeaveDays() + "����:" + request.getReason());
			System.out.println("�ܾ���:" + this.name + "����ͨ��");
		} else {
			System.out.println("�ܾ�������");
		}
	}

}
