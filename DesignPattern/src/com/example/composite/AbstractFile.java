package com.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 北飞的候鸟
 *
 */

public interface AbstractFile {
	void killVirus();
}

class  ImageFile implements AbstractFile{
	
	private String name;
	
	public ImageFile(String name){
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("ImageFile：" + name + "进行查杀");
	}
}

class  TextFile implements AbstractFile{
	
	private String name;
	
	public TextFile(String name){
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("TextFile：" + name + "进行查杀");
	}
}

class  VideoFile implements AbstractFile{
	
	private String name;
	
	public VideoFile(String name){
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("VideoFile：" + name + "进行查杀");
	}
}

class Folder implements AbstractFile{
	
	private String name;
	private List<AbstractFile> list = new ArrayList<>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("文件夹" + name + "，进行查杀！"); 
		for(AbstractFile file : list){
			file.killVirus();
		}
	}
	
	public void add(AbstractFile file){
		list.add(file);
	}
	
	public void remove(AbstractFile file){
		list.remove(file);
	}
	
	public AbstractFile getChaild(int index){
		
		return list.get(index);
	}
	
}
