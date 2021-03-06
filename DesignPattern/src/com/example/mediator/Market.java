package com.example.mediator;

public class Market implements Department{

	private Mediator m;
	
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("Market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("Market");
	}

	@Override
	public void outAction() {
		System.out.println("Market");
		m.command("Finacial");
	}

}
