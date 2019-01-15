package com.mediator;

public class Market implements Department {
	private Mediator m;
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("接项目");
	}

	@Override
	public void outAction() {
		
		System.out.println("market汇报工作");
		m.command("finacial");
	}
}
