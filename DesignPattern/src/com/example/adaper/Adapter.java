package com.example.adaper;

public class Adapter extends Adaptee implements Target{
	

	@Override
	public void handleReq() {
		super.request();
	}

}
