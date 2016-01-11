package com.example.mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator{

	private Map<String,Department> map = new HashMap<>();
	
	@Override
	public void register(String dname, Department departement) {
		map.put(dname, departement);
	}

	@Override
	public void command(String dname) {
		map.get(dname).selfAction();
	}

}
