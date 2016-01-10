package com.example.flyweight;

/**
 * ���ٶ�������
 * �������
 * �ⲿ״̬��Զ���
 * ʱ�任�ռ�
 * 
 * @author ���ɵĺ���
 *
 */
public class FlyWeightClient {

	public static void main(String[] args) {
		
		ChessFlyWeight c1 = ChessFlyWeightFactory.getChess("��ɫ");
		ChessFlyWeight c2 = ChessFlyWeightFactory.getChess("��ɫ");
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("�����ⲿ״̬�Ĵ���");
		c1.display(new Coordinate(1, 1));
		c2.display(new Coordinate(2, 2));
	}
}