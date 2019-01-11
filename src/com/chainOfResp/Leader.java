package com.chainOfResp;
/**
 * ������
 * @author simon
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;//�������ĺ�̶���
	public Leader(String name) {
		super();
		this.name = name;
	}
	//�趨�������ϵĺ�̶���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	/**
	 * ��������ĺ��ĵ�ҵ�񷽷�
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);
}
