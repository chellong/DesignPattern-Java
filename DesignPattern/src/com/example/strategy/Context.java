package com.example.strategy;

/**
 * 
 * ����;���Ĳ����ཻ�� �����Ļ���������㷨��ֱ�ӵĿͻ��˵��÷����ˣ�
 * ʹ���㷨���Զ����ڿͻ��˶����ı仯�� ���ʹ��spring������ע�빦�ܣ�
 * ������ͨ�������ļ�����̬��ע�벻ͬ���Զ��� ��̬���л���ͬ���㷨.
 *
 * @author ���ɵĺ���
 * 
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void pringPrice(double s) {
		System.out.println("�����ļ۸�" + strategy.getPrice(s));
	}

}