package com.example.flyweight;

/**
 * 减少对象数量
 * 提高性能
 * 外部状态相对独立
 * 时间换空间
 * 
 * @author 北飞的候鸟
 *
 */
public class FlyWeightClient {

	public static void main(String[] args) {
		
		ChessFlyWeight c1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight c2 = ChessFlyWeightFactory.getChess("黑色");
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("增加外部状态的处理");
		c1.display(new Coordinate(1, 1));
		c2.display(new Coordinate(2, 2));
	}
}
