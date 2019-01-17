package com.simon.mediator;

public class Development implements Department {

	private Mediator m;
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("专心科研，开发项目");
		
		
	}

	@Override
	public void outAction() {
		System.out.println("development汇报工作");

	}

}
