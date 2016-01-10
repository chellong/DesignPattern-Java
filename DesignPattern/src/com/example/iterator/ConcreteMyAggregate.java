package com.example.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *@author ���ɵĺ���
 */
public class ConcreteMyAggregate {
	
	private List<Object> list = new ArrayList<Object>();

	public void addObject(Object obj){
	
		this.list.add(obj);
	}
	
	public void removeObject(Object obj){
	
		this.list.remove(obj);
	}

	public List<Object> getList() {
	
		return list;
	}

	public void setList(List<Object> list) {
	
		this.list = list;
	}
	
	
	public MyIterator  createIterator(){
	
		return new ConcreteIterator();
	}
	
	
	
	private class ConcreteIterator implements MyIterator {

		private int cursor;  
		
		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()){
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1)?true:false;
		}

		@Override
		public void next() {
			if(cursor<list.size()){
				cursor++;
			}
		}
		
	}
	
	
	
	
}
