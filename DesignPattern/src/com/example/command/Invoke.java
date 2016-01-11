package com.example.command;

public class Invoke {

	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	public void call(){
		System.out.println("Invoke before");
		command.execute();
		System.out.println("Invoke after");
	}
}
