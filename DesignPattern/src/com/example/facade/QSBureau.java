package com.example.facade;

/**
 * 质检局
 * @author 北飞的候鸟
 *
 */
public interface QSBureau {

	void  orgCodeCertificate();  

}

class BeiJinQSBureau implements QSBureau{
	

	@Override
	public void orgCodeCertificate() {
		System.out.println("我是质检局不质检！");
	}
}
