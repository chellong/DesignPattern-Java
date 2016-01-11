package com.example.command;

public class ConcreateCommand implements Command{

	private Receiver receiver;
	
	
	public ConcreateCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}



	@Override
	public void execute() {
		System.out.println("ConcreateCommand before");
		receiver.action();
		System.out.println("ConcreateCommand after");
	}

}
