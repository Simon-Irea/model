package com.chainOfResp;

public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println("员工姓名:" + request.getEmpName() + "请假天数:" + request.getLeaveDays() + "理由:" + request.getReason());
			System.out.println("总经理:" + this.name + "审批通过");
		} else {
			System.out.println("总经理审批");
		}
	}

}
