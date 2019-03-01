package com.simon.proxy.staticProxy;
/**
 * 定义一个具体的明星
 * @author Administrator
 *
 */
public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println();
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		System.out.println("周杰伦");
	}

	@Override
	public void collectMoney() {
		System.out.println();
	}

}
