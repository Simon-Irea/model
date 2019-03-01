package com.simon.proxy.staticProxy;
/**
 * 代理类，继承明星类
 * @author Administrator
 *
 */
public class ProxyStar implements Star {

	private Star star = new RealStar();
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		// TODO Auto-generated method stub

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
		star.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub

	}

}
