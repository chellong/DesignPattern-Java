package com.example.bridge;

/**
 * test
 * @author ���ɵĺ���
 *
 */
public interface Computer {
	
	void sale();
}

class DeskTop implements Computer{

	@Override
	public void sale() {
		System.out.println("���۵���");
	}
}

class LapTop implements Computer{

	@Override
	public void sale() {
		System.out.println("���۱ʼǱ�");
	}
}

class Pad implements Computer{

	@Override
	public void sale() {
		System.out.println("����ƽ�����");
	}
}

class LenovoDeskTop extends DeskTop{
	
	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}

class LenovoLapTop extends LapTop{
	@Override
	public void sale() {
		System.out.println("��������ʼǱ�");
	}
}

class LenovoPad extends Pad{
	@Override
	public void sale() {
		System.out.println("��������ƽ��");
	}
}


class ShenzhouDeskTop extends DeskTop{
	
	@Override
	public void sale() {
		System.out.println("����Shenzhoųʽ��");
	}
}

class ShenzhouLapTop extends LapTop{
	@Override
	public void sale() {
		System.out.println("����Shenzhou�ʼǱ�");
	}
}

class ShenzhouPad extends Pad{
	@Override
	public void sale() {
		System.out.println("����Shenzhouƽ��");
	}
}

class DaiErDeskTop extends DeskTop{
	
	@Override
	public void sale() {
		System.out.println("����DaiEr̨ʽ��");
	}
}

class DaiErLapTop extends LapTop{
	@Override
	public void sale() {
		System.out.println("����DaiEr�ʼǱ�");
	}
}

class DaiErPad extends Pad{
	@Override
	public void sale() {
		System.out.println("����DaiErƽ��");
	}
}