package com.example.facade;


/**
 *	@author ���ɵĺ���
 */
public class RegisterFacade {
	public void register(){
		
		BeiJinTAIBureau bjTAI = new BeiJinTAIBureau();
		BeiJinQSBureau 	bjJQS = new BeiJinQSBureau();
		BejinTBureau    bjBur = new BejinTBureau();
		Bank b = new BankImpl();
		
		bjTAI.checkName();
		bjJQS.orgCodeCertificate();
		bjBur.taxCertificate();
		b.openAccount();
	}
	
	
}
