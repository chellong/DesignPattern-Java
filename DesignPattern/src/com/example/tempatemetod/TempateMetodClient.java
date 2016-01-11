package com.example.tempatemetod;

/**
 * 模板方法 -- 回调函数
 * 
 * @author 北飞的候鸟
 *
 */
public class TempateMetodClient {
	
	public static void main(String[] args) {
	
		BankTemplateMethod btm = new DrawMoney();
		btm.process();

		//采用匿名内部类
		BankTemplateMethod btm2 = new BankTemplateMethod() {

			@Override
			public void transact() {
				System.out.println("我要存钱！");
			}
		};
		btm2.process();

		BankTemplateMethod btm3 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要理财！我这里有2000万");
			}
		};

		btm3.process();

	}
}

class DrawMoney extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}

}
