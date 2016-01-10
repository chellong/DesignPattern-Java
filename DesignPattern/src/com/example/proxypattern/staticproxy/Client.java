package com.example.proxypattern.staticproxy;

public class Client {

	public static void main(String[] args) {
		Star real  = new RealStar();
		Star p = new ProxStar(real);
		
		p.confer();
		p.signContract();
		p.bookTicket();
		p.sing();
		p.collectMoney();
	}
}
