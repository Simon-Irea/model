package com.simon.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");
		
		MyIterator iter = cma.createIterator();
		while (iter.hasNext()) {
			//һ���ڷ���һ�������ʱ���α���Զ���һ
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}
}
