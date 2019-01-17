package com.simon.chainOfResp;

public class Manager extends Leader{

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 10) {
			System.out.println("Ա������:" + request.getEmpName() + "�������:" + request.getLeaveDays() + "����:" + request.getReason());
			System.out.println("����:" + this.name + "����ͨ��");
		} else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}

}
