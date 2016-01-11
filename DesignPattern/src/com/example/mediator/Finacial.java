package com.example.mediator;

@SuppressWarnings("unused")
public class Finacial implements Department{

	private Mediator m;
	
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("Finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("Finacial self");
	}

	@Override
	public void outAction() {
		System.out.println("Finacial out");
	}

}
