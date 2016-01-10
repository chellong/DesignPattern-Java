package com.example.composite;

public class Client {
	
	public static void main(String[] args) {
		AbstractFile f2,f3,f4;
		Folder f1 = new Folder("2234");
		Folder ff = new Folder("5234");
		
		f2 = new ImageFile("1234");
		f3 = new VideoFile("3234");
		f4 = new TextFile("4234");
		
		f1.add(f2);
		f1.add(f3);
		f1.add(f4);
		ff.add(f1);
		
		f1.killVirus();
		f2.killVirus();
		f3.killVirus();
		f4.killVirus();
		ff.killVirus();
	}

}
