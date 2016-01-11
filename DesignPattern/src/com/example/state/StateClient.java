package com.example.state;

/**
 * 状态模式
 * 
 * @author 北飞的候鸟
 *
 */
public class StateClient {

	public static void main(String[] args) {
	
		HomeContext ctx = new HomeContext();
		
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
		
	}
}
