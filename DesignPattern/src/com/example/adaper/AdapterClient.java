package com.example.adaper;

/**
 * �ͻ�����
 * 
 * @author ���ɵĺ���
 *
 */
public class AdapterClient {
	
	public  void test(Target t){
		t.handleReq();
	}
	
	public static void main(String[] args) {
//		AdapterClient c = new AdapterClient();
//		Target t = new Adapter();
//		c.test(t);
		
		AdapterClient c = new AdapterClient();
		Adaptee a = new Adaptee();
		Target t = new Adapter2(a);
		c.test(t);
	}
	

}
