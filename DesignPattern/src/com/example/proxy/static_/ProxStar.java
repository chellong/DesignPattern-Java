package com.example.proxy.static_;

public class ProxStar implements Star{

	private Star star;
	
	public ProxStar(Star star) {
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		star.confer();
	}

	@Override
	public void signContract() {
		star.signContract();
	}

	@Override
	public void bookTicket() {
		star.bookTicket();
	}

	@Override
	public void sing() {
		System.out.println("supper star");
		star.sing();
	}

	@Override
	public void collectMoney() {
		star.collectMoney();
	}

	
}
