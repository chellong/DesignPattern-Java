package com.example.facade;

public interface Bank{
	void  openAccount();  
}


class BankImpl implements Bank {

	@Override
	public void openAccount() {
		System.out.println("我是银行我有钱");
	}

}