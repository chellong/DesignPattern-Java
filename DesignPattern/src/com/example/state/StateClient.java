package com.example.state;

/**
 * ״̬ģʽ
 * 
 * @author ���ɵĺ���
 *
 */
public class StateClient {

	public static void main(String[] args) {
	
		HomeContext ctx = new HomeContext();
		
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
		
	}
}
