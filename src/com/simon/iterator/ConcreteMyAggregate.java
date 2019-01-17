package com.simon.iterator;

import java.util.List;
import java.util.ArrayList;

public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();
	
	public void addObject(Object obj) {
		this.list.add(obj);
	}
	public void removeObject(Object obj) {
		this.list.remove(obj);
	}
	
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	//使用内部类定义迭代器，可以直接使用外部类的属性
	private class ConcreteIterator implements MyIterator {
		
		private int cursor;//定义游标用于记录遍历时的位置
		
		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			if (cursor < list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (cursor < list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return cursor == 0 ? true : false;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return cursor == (list.size() - 1) ? true : false;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}
		
	}
	
}
